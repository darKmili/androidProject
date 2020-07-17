package com.example.launchmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * 这是一个singleInstance
 */
public class Main2Activity extends BaseActivity {
    private Button button;
    private static final String TAG = "Second";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"this is task"+getTaskId());
        setContentView(R.layout.activity_main2);
        //启动第三个Activity
        button=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Main3Activity.actionStart(Main2Activity.this);
            }
        });
    }

    public static void actionStart(Context context){
        Intent intent=new Intent(context,Main2Activity.class);
        //可以通过传入参数给Intent
        context.startActivity(intent);
    }
}
