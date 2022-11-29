package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class relative_layout_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_1);
    }

    public void fletxaOnClickEvent(View view) {
        Intent intent = new Intent(this, frame_layout_2.class);
        startActivity(intent);
    }

}