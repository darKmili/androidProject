package com.darkmili.materialtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class FruitActivity extends AppCompatActivity {
    public static final String FRUIT_NAME = "fruit_name";
    public static final String FRUIT_IMAGE_ID = "fruit_id";

    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private ActionBar actionBar;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        if (Build.VERSION.SDK_INT >= 21){
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        imageView = findViewById(R.id.fruit_image);
        textView = findViewById(R.id.fruit_text);
        toolbar = findViewById(R.id.fruit_toolbar);


        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_back);
        }
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("person_bundle");
        String name = bundle.getString(FRUIT_NAME);
        int imageId = bundle.getInt(FRUIT_IMAGE_ID);
        collapsingToolbarLayout = findViewById(R.id.collapsing_tool);
        collapsingToolbarLayout.setTitle(name);
        Glide.with(this).load(imageId).into(imageView);
        textView.setText(generateContent(name));
        textView.setTextSize(25);

    }
    //展示测试
    public String generateContent(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1200; i++) {
            builder.append(s);
        }
        return builder.toString();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}