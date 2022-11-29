package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class contraint_layout_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout_6);
    }

    public void seguentContstraintOnClick(View view) {
        Intent intent = new Intent(this, RadioCheck_7.class);
        startActivity(intent);
    }
}