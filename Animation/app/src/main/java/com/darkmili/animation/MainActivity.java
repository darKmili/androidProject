package com.darkmili.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.demo);
        final AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.start();
            }
        });
    }
}