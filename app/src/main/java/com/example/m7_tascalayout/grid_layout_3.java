package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class grid_layout_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout_3);
    }

    public void fletxaEnreraOnClick(View view) {
        Intent intent = new Intent(this, frame_layout_2.class);
        startActivity(intent);
    }

    public void seguentGridOnclick(View view) {
        Intent intent = new Intent(this, lineal_layout_4.class);
        startActivity(intent);
    }
}