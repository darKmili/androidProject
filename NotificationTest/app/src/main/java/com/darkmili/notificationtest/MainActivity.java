package com.darkmili.notificationtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt_notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_notice=findViewById(R.id.bt_notice);
        bt_notice.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //设置pendingIntent,当点击通知时启动跳转。
        Intent intent = new Intent(MainActivity.this, NoticeActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,0);
        //获取通知管理者对象，通过它对通知进行管理（启动，删除等）
        NotificationManager manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //获取通知对象，setStyle方法可以构建多样的通知
        Notification notification= new NotificationCompat.Builder(MainActivity.this,"default")
                .setContentText("这是一个通知")
                .setContentTitle("通知")
                .setSmallIcon(R.mipmap.ic_launcher)//设置小图标
                .setContentIntent(pendingIntent)//设置Intent
                .setAutoCancel(true)//设置点击后自动关闭
                .setWhen(System.currentTimeMillis())//设置启动时间
                .setPriority(Notification.PRIORITY_MIN)//设置优先级
                //设置通知大图
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(getResources(),R.mipmap.apple_pic)))
                .build();
        //管理器启动通知
        manager.notify(1,notification);
    }
}