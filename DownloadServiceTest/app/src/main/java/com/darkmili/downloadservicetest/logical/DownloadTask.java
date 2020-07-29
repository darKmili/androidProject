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

//第一个参数前台传入，第二个参数进度显示，第三个参数结果反馈
public class DownloadTask extends AsyncTask<String, Integer, Integer> {
    //反馈结果常量
    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_FAILED = 1;
    public static final int TYPE_PAUSED = 2;
    public static final int TYPE_CANCELED = 3;

    private DownloadListener listener;
    private boolean isCanceled = false;
    private boolean isPaused = false;
    private int last_progress;

    public DownloadTask(DownloadListener listener) {
        this.listener = listener;
    }

//    @Override
//    protected Integer doInBackground(String... strings) {
//        InputStream inputStream = null;
//        RandomAccessFile accessFile = null;
//        File file = null;
//        try {
//            long downloadLength = 0;//记载下载文件长度
//            String url = strings[0];
//            String fileName = url.substring(url.lastIndexOf("/"));
//            String direction = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
//            file = new File(direction + fileName);
////            accessFile=new RandomAccessFile(direction+fileName,"rw");
//            if (file.exists()) {
//                downloadLength = file.length();
//            }
//            long contentLength = getContentLength(url);//获取下载文件大小
////            long contentLength=888;
//            if (contentLength == 0) {
//                //文件大小为0,下载失败
//                return TYPE_FAILED;
//            } else if (contentLength == downloadLength) {
//                //下载文件大小和已经下载文件大小相同，则表示下载成功
//                return TYPE_SUCCESS;
//            }
//            //继续下载
//            OkHttpClient client = new OkHttpClient();
//            Request request = new Request.Builder()
//                    .url(url)
//                    .header("RANGE", "bytes=" + downloadLength + "-")
//                    .build();
//            Response response = client.newCall(request).execute();
//            if (response != null) {
//                inputStream = response.body().byteStream();
//                byte[] in = new byte[1024];
//                int len;
//                int total = 0;
//                accessFile = new RandomAccessFile(file, "wr");
//                accessFile.seek(downloadLength);
//                while ((len = inputStream.read(in)) != -1) {
//                    if (is_paused) {
//                        //暂停
//                        return TYPE_PAUSED;
//                    }
//                    if (is_canceled) {
//                        //取消下载，删除文件
//                        file.delete();
//                        return TYPE_CANCELED;
//                    }
//                    //写入文件
//                    accessFile.write(in, 0, len);
//                    total += len;
//                    //下载进度
//                    int progress = (int) ((downloadLength + total) * 100 / contentLength);
//                    //进度同步
//                    response.body().close();
//                    publishProgress(progress);
//                }
//                response.body().close();
//                return TYPE_SUCCESS;
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (accessFile != null) {
//                    accessFile.close();
//                }
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return TYPE_FAILED;
//
//
//    }

    @Override
    protected Integer doInBackground(String... params) {
        InputStream is = null;
        RandomAccessFile savedFile = null;
        File file = null;
        try {
            long downloadedLength = 0; // 记录已下载的文件长度
            String downloadUrl = params[0];
            String fileName = downloadUrl.substring(downloadUrl.lastIndexOf("/"));
            String directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            file = new File(directory + fileName);
            if (file.exists()) {
                downloadedLength = file.length();
            }
            long contentLength = getContentLength(downloadUrl);
            if (contentLength == 0) {
                return TYPE_FAILED;
            } else if (contentLength == downloadedLength) {
                // 已下载字节和文件总字节相等，说明已经下载完成了
                return TYPE_SUCCESS;
            }
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    // 断点下载，指定从哪个字节开始下载
                    .addHeader("RANGE", "bytes=" + downloadedLength + "-")
                    .url(downloadUrl)
                    .build();
            Response response = client.newCall(request).execute();
            if (response != null) {
                is = response.body().byteStream();
                savedFile = new RandomAccessFile(file, "rw");
                savedFile.seek(downloadedLength); // 跳过已下载的字节
                byte[] b = new byte[1024];
                int total = 0;
                int len;
                while ((len = is.read(b)) != -1) {
                    if (isCanceled) {
                        return TYPE_CANCELED;
                    } else if(isPaused) {
                        return TYPE_PAUSED;
                    } else {
                        total += len;
                        savedFile.write(b, 0, len);
                        // 计算已下载的百分比
                        int progress = (int) ((total + downloadedLength) * 100 / contentLength);
                        publishProgress(progress);
                    }
                }
                response.body().close();
                return TYPE_SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (savedFile != null) {
                    savedFile.close();
                }
                if (isCanceled && file != null) {
                    file.delete();
                }
            } catch (Exception e) {
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
        isPaused = true;
    }

    public void cancelDownload() {
        isCanceled = true;
    }

    private long getContentLength(String downloadUrl) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(downloadUrl)
                .build();
        Response response = client.newCall(request).execute();
        if (response != null && response.isSuccessful()) {
            long contentLength = response.body().contentLength();
            response.close();
            return contentLength;
        }
        int i=0;
        return 0;
    }
//    public long getContentLength(String url) {
//        //判断文件大小
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        try {
//
//            Response response = client.newCall(request).execute();
//            if (response != null && response.isSuccessful()) {
//                response.close();
//                return response.body().contentLength();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return 0;
//    }
}
