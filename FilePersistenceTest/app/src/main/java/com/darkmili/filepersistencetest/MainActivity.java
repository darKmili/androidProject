package com.darkmili.filepersistencetest;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit1);
        textView=findViewById(R.id.text1);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        if (!read().isEmpty()){
            textView.setText(read());
        }
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        save(editText.getText().toString());
        super.onDestroy();

    }

    public void save(String s) {
        FileOutputStream fileOutputStream = null;
        BufferedWriter bufferedWriter = null;
        //第一个参数是文件名，不可包含路径保存中指定目录下，第二个参数是文件操作模式，MODE_PRIVATE覆盖写，MODE_APPEND追加写入。
        try {
            fileOutputStream = openFileOutput("data", Context.MODE_PRIVATE);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            bufferedWriter.write(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String read(){
        StringBuilder builder = new StringBuilder();
        FileInputStream fileInputStream=null;
        BufferedReader reader=null;
        try {
             fileInputStream = openFileInput("data");
            reader=new BufferedReader(new InputStreamReader(fileInputStream));
            String s="";
            while ((s=reader.readLine())!=null){
                builder.append(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return builder.toString();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                    //保存文件

                save(editText.getText().toString());
                break;
            case R.id.button2:
              textView.setText(read());
                break;
            default:

        }
    }
}
