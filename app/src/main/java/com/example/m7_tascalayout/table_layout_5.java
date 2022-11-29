package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class table_layout_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_5);
    }

    public void seguentTableOnClick(View view) {
        Intent intent = new Intent(this, contraint_layout_6.class);
        startActivity(intent);
    }
}