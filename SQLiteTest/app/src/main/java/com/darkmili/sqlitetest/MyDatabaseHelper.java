package com.darkmili.sqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import static android.widget.Toast.LENGTH_SHORT;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_TABLE="create table Book("+
            "id integer primary key autoincrement,"+
            "author text,"+
            "price real,"+
            "pages integer,"+
            "name text)";
    private Context context;
    public MyDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
        Toast.makeText(context,"创建数据库成功", LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
