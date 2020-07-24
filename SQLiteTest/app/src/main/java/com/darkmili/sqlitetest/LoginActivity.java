package com.darkmili.sqlitetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
  private MyDatabaseHelper helper=null;
    private Button bt_create;
    private Button bt_insert;
    private Button bt_update;
    private Button bt_delete;
    private Button bt_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        helper=new MyDatabaseHelper(LoginActivity.this,"bookstore",null,1);

        bt_create=findViewById(R.id.bt_create);
        bt_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helper.getWritableDatabase();
            }
        });

        bt_insert=findViewById(R.id.bt_insert);
        bt_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase database = helper.getWritableDatabase();
                ContentValues values=new ContentValues();
                values.put("id",1);
                values.put("name","tiantian");
                values.put("price",87.22);
                values.put("author","王羲之");
                database.insert("book",null,values);
                Toast.makeText(LoginActivity.this,"插入成功",Toast.LENGTH_SHORT).show();
                //如果要执行下一条语句，需要清空values里面的指
//                values.clear();
            }
        });

        bt_update=findViewById(R.id.bt_update);
        bt_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase database = helper.getWritableDatabase();
                ContentValues values=new ContentValues();
                values.put("author","xiaoming");

                database.update("book",values,"author=?",new String[]{"王羲之"});
                Toast.makeText(LoginActivity.this,"修改成功",Toast.LENGTH_SHORT).show();
                values.clear();

            }
        });


        bt_delete = findViewById(R.id.bt_delete);
        bt_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase writableDatabase = helper.getWritableDatabase();
                writableDatabase.delete("book","author=?",new String[]{"xiaoming"});
                Toast.makeText(LoginActivity.this,"删除成功",Toast.LENGTH_SHORT).show();

            }
        });


        bt_select=findViewById(R.id.bt_select);
        bt_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase readableDatabase = helper.getReadableDatabase();
                Cursor book = readableDatabase.query("book", null, null, null, null, null, null);
                if (book.moveToFirst()){
                    do{
                        int id = book.getInt(book.getColumnIndex("id"));
                        String name = book.getString(book.getColumnIndex("name"));
                        double price=book.getDouble(book.getColumnIndex("price"));
                        String author=book.getString(book.getColumnIndex("author"));
                        Log.d("表数据",id+name+price+author);



                    }while (book.moveToNext());

                }

            }
        });

    }
//
}
