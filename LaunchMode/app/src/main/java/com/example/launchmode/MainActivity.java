package com.example.launchmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    private static final String TAG = "First";
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"this is task"+getTaskId());
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button1);
        //启动第二个Activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Main2Activity.actionStart(MainActivity.this);
            }
        });
    }
}
