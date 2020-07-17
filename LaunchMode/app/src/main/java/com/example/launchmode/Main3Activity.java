package com.example.launchmode;


import android.content.Context;
import android.os.Process;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends BaseActivity {
    private Button button;
    private Button button1;
    private static final String TAG = "Third";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"this is task"+getTaskId());
        setContentView(R.layout.activity_main3);
        //启动第一个Activity
        button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.actionStart(Main3Activity.this);
            }
        });
        button1=(Button)findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finishAll();
                Process.killProcess(Process.myPid());
            }
        });
    }

    public static void actionStart(Context context){
        Intent intent=new Intent(context,Main3Activity.class);
        //可以通过传入参数给Intent
        context.startActivity(intent);
    }
}
