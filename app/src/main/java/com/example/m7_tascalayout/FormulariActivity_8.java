package com.example.m7_tascalayout;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FormulariActivity_8 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    private String spinnerSelection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulari_8);

        //Importem l'spinner
        this.spinner = (Spinner) findViewById(R.id.spinner);
        //Creem l'adapter:
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerStrings, android.R.layout.simple_spinner_item);
        // Especifiquem el layout que volem que mostri l'spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Aplicar l'adapter a l'spinner
        this.spinner.setAdapter(adapter);
        //Creem un listener per quan es s
        this.spinner.setOnItemSelectedListener(this);

        //Spinner TextView
        ListView simpleListView;
        // array objects
        String courseList[] = {"C-Programming", "Data Structure", "Database", "Python",
                "Java", "Operating System", "Compiler Design", "Android Development"};


        simpleListView = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);
        simpleListView.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.spinnerSelection = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}