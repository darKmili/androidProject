package com.darkmili.downloadservicetest.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Environment;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.darkmili.downloadservicetest.MainActivity;
import com.darkmili.downloadservicetest.R;
import com.darkmili.downloadservicetest.logical.DownloadListener;
import com.darkmili.downloadservicetest.logical.DownloadTask;

import java.io.File;

public class DownloadService extends Service {
    private DownloadTask downloadTask;
    private String downloadUrl;
    private DownloadListener downloadListener = new DownloadListener() {
        @Override
        public void onProgress(int progress) {
            getNotificationManager().notify(1, getNotification("正在下载...", progress));
        }

        @Override
        public void onSuccess() {
            //下载成功,停止前台服务
            downloadTask = null;
            stopForeground(true);
            Toast.makeText(DownloadService.this, "下载成功", Toast.LENGTH_SHORT).show();
            getNotificationManager().notify(1, getNotification("下载成功...", -1));
        }

        @Override
        public void onFailed() {
            //下载失败，停止前台服务
            downloadTask = null;
            stopForeground(true);
            Toast.makeText(DownloadService.this, "下载失败", Toast.LENGTH_SHORT).show();
            getNotificationManager().notify(1, getNotification("下载失败..", -1));
        }

        @Override
        public void onCanceled() {
            downloadTask = null;
            stopForeground(true);
            Toast.makeText(DownloadService.this, "关闭下载", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPaused() {
            downloadTask = null;
            Toast.makeText(DownloadService.this, "暂停下载", Toast.LENGTH_SHORT).show();
        }
    };
    private DownloadBinder myBinder=new DownloadBinder();

    public class DownloadBinder extends Binder {

        public void startDownload(String url){
            if (downloadTask==null){
                downloadTask=new DownloadTask(downloadListener);
                downloadUrl=url;
                downloadTask.execute();
                startForeground(1,getNotification("正在下载",0));
                Toast.makeText(DownloadService.this,"开始下载",Toast.LENGTH_SHORT).show();
            }
        }
        public void pauseDownload(){
            if (downloadTask!=null){
                downloadTask.pauseDownload();
            }
        }
        public void cancelDownload(){
            if (downloadTask!=null){
                downloadTask.cancelDownload();
            }else {
                //删除文件
                if (downloadUrl!=null){
                    String fileName = downloadUrl.substring(downloadUrl.lastIndexOf("/"));
                    String direction = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                    File file=new File(direction+fileName);
                    if (file.exists()){
                        file.delete();
                    }
                }
                //关闭通知
                getNotificationManager().cancel(1);
                stopForeground(true);

            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    //获取通知管理者
    private NotificationManager getNotificationManager() {
        return (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    //获取通知实体对象
    private Notification getNotification(String title, int progress) {
        Intent intent = new Intent(this, MainActivity.class);
        //构建pendingIntent
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        if (progress >= 0) {
            //默认当下载进度大于0时才显示下载进度
            builder.setContentText(progress + "%");
            builder.setProgress(100, progress, false);
        }
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle(title);
        return builder.build();
    }
}
