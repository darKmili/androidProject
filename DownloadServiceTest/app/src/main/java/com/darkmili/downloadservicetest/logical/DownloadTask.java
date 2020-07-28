package com.darkmili.downloadservicetest.logical;

import android.os.AsyncTask;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DownloadTask extends AsyncTask<String, Integer, Integer> {
    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_FAILED = 1;
    public static final int TYPE_PAUSED = 2;
    public static final int TYPE_CANCELED = 3;

    private DownloadListener listener;
    private boolean is_canceled = false;
    private boolean is_paused = false;
    private int last_progress;

    public DownloadTask(DownloadListener listener) {
        this.listener = listener;
    }

    @Override
    protected Integer doInBackground(String... strings) {
        InputStream inputStream = null;
        RandomAccessFile accessFile = null;
        File file = null;
        try {
            long downloadLength = 0;//记载下载文件长度
            String url = strings[0];
            String fileName = url.substring(url.lastIndexOf("/"));
            String direction = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            file = new File(direction + fileName);
//            accessFile=new RandomAccessFile(direction+fileName,"rw");
            if (file.exists()) {
                downloadLength = file.length();
            }
            long contentLength = getContentLength(url);//获取下载文件大小
            if (contentLength == 0) {
                //文件大小为0,下载失败
                return TYPE_FAILED;
            }
            if (contentLength == downloadLength) {
                //下载成功
                return TYPE_SUCCESS;
            }
            //继续下载
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .header("RANGE", "Byte=" + downloadLength + "-")
                    .build();
            Response response = client.newCall(request).execute();
            inputStream = response.body().byteStream();
            byte[] in = new byte[1024];
            int len;
            int total = 0;
            accessFile = new RandomAccessFile(file, "wr");
            accessFile.seek(downloadLength);
            while ((len = inputStream.read(in)) != -1) {
                if (is_paused) {
                    //暂停
                    return TYPE_PAUSED;
                }
                if (is_canceled) {
                    //取消下载，删除文件
                    file.delete();
                    return TYPE_CANCELED;
                }
                //写入文件
                accessFile.write(in, 0, len);
                total += len;
                //下载进度
                int progress = (int) ((downloadLength + total) * 100 / contentLength);
                //进度同步
                response.body().close();
                publishProgress(progress);

            }
            return TYPE_SUCCESS;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (accessFile != null) {
                    accessFile.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return TYPE_FAILED;


    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        int progress = values[0];
        if (progress > last_progress) {
            listener.onProgress(progress);
            last_progress = progress;
        }
    }

    @Override
    protected void onPostExecute(Integer status) {
        //根据返回结果执行回调方法
        switch (status) {
            case TYPE_SUCCESS:
                listener.onSuccess();
                break;
            case TYPE_FAILED:
                listener.onFailed();
                break;
            case TYPE_PAUSED:
                listener.onPaused();
                break;
            case TYPE_CANCELED:
                listener.onCanceled();
                break;
        }
    }

    public void pauseDownload() {
        is_paused = true;
    }

    public void cancelDownload() {
        is_canceled = true;
    }

    public long getContentLength(String url) {
        //判断文件大小
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (response != null && response.isSuccessful()) {
            return response.body().contentLength();
        }
        return 0;
    }
}
