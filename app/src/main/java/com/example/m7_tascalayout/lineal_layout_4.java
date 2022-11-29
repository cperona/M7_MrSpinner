package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class lineal_layout_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineal_layout_4);
    }

    public void seguentLinealOnClick(View view) {
        Intent intent = new Intent(this, table_layout_5.class);
        startActivity(intent);
    }
}