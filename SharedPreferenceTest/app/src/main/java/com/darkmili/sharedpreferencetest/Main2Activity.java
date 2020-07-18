package com.darkmili.sharedpreferencetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.LinkedList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private List<Friend> friendList = new LinkedList<>();

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.bottom_button_left);
        button.setBackgroundColor(R.color.colorButton);


        initList();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        FriendAdapter adapter = new FriendAdapter(friendList);
        recyclerView.setAdapter(adapter);

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO 选中列表某一项，与用户进行聊天
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.right_scan, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_f:
                //TODO 查找添加好友
                break;
            case R.id.take_photo:
                //TODO 通过相机拍照保存
                //打开相机
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
                //取出照片
                Bundle bundle = getIntent().getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data");
                break;
            default:
        }
        return true;
    }



    public void initList() {
        //TODO 初始化列表,通过用户名和密码匹配个人用户好友数据库，加载数据
        for (int i = 0; i < 30; i++) {
            friendList.add(new Friend(R.drawable.iam, "xiaomi"));
            friendList.add(new Friend(R.drawable.iam, "xiaomi"));
        }

    }

}
