package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class frame_layout_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_2);
    }

    public void fletxaEnreraOnClick(View view) {
        Intent intent = new Intent(this, relative_layout_1.class);
        startActivity(intent);
    }

    public void seguentFrameOnClick(View view) {
        Intent intent = new Intent(this, grid_layout_3.class);
        startActivity(intent);
    }
}