package com.example.hipster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {
    BlurImageView blueImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueImage = findViewById(R.id.blueImage);
        blueImage.setBlur(15);
    }
}