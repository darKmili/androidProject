package com.example.uiapplearn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * 本来继承接口，实现按钮监听器onClick
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private ImageView imageView;
private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button11);
        editText = (EditText) findViewById(R.id.editText);
        button.setOnClickListener(this);

        Button button1 = (Button) findViewById(R.id.button12);
        imageView = (ImageView) findViewById(R.id.img);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button13);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button11:
                String text = editText.getText().toString();
                Toast.makeText(this, text, Toast.LENGTH_LONG).show();
                break;
            case R.id.button12:
                imageView.setImageResource(R.drawable.b);
                break;
            case R.id.button13:
//                if (progressBar.getVisibility()==View.VISIBLE){
//                    progressBar.setVisibility(View.GONE);
//                }else {
//                    progressBar.setVisibility(View.VISIBLE);
//                }

//                progressBar.setProgress(progressBar.getProgress()+10);


//                AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
//                alertDialog.setTitle("this is alertDialog");
//                alertDialog.setMessage("是否删除");
//                alertDialog.setCancelable(false);
//                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//
//                alertDialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//                alertDialog.show();

                ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("Dialog");
                progressDialog.setMessage("加载中———");
                progressDialog.setCancelable(false);
                progressDialog.show();
                break;
            default:
        }
    }
}
