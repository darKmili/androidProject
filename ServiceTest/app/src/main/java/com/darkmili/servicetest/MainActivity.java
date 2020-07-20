package com.darkmili.servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.telecom.Connection;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button start;
    private Button stop;

    private ServiceConnection connection= new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ((MyService.Mybind)iBinder).show();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.button1);
        stop=findViewById(R.id.button2);


        start.setOnClickListener(this);

        stop.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intent=new Intent(this,MyService.class);
                bindService(intent,connection,BIND_AUTO_CREATE);
                break;
            case R.id.button2:
                unbindService(connection);
                break;
            default:
        }
    }
}