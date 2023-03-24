package com.example.mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void btnclick(View view) {
        switch(view.getId()) {
            case R.id.btnUp:
                imageView.setImageResource(R.drawable.photo);
                imageView2.setImageResource(0);
                break;
            case R.id.btnDown:
                imageView.setImageResource(0);
                imageView2.setImageResource(R.drawable.photo);
                break;
        }
    }
}