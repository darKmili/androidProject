package com.darkmili.sqlitetest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.tablemanager.Connector;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_create=findViewById(R.id.create_table);
        button_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connector.getDatabase();
                Toast.makeText(MainActivity.this,"创建成功",Toast.LENGTH_SHORT);
            }
        });

    }
//    class Lite extends LitePalApplication{
//
//    }
}
