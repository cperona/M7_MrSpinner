package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RadioCheck_7 extends AppCompatActivity {

    private boolean chkMarcam1;
    private  boolean chhMarcam2;
    private boolean rbOpcio1;
    private boolean rbOpcio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_check_7);
    }

    public void chkMarcam1OnClick(View view) {
        chkMarcam1 = true;
    }

    public void chkMarcam2OnClick(View view) {
        chhMarcam2 = true;
    }

    public void rbOpcio1OnClick(View view) {
        rbOpcio1 = true;
    }

    public void rbOpcio2OnClick(View view) {
        rbOpcio2 = true;
    }

    public void resultat() {
        TextView textView = findViewById(R.id.resultatTextView);
        textView.setText("Marcam1 : " + chkMarcam1 + "\n" + "Marcam2 : " + chhMarcam2 + "\n" + "Acceptar : " + rbOpcio1 + "\n" + "Cancelar : " + rbOpcio2);
    }

    public void submitButtonOnClick(View view) {
        resultat();
    }

    public void radioSeguentButtonOnClick(View view) {
        Intent intent =  new Intent(this, FormulariActivity_8.class);
        startActivity(intent);
    }
}