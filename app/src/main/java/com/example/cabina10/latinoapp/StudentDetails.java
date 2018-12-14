package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class StudentDetails extends AppCompatActivity {

   // public EditText variable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        //Intent myIntent = getIntent(); // gets the previously created intent
        //int _productId = myIntent.getIntExtra("productId", 0);

        //variable = (EditText)findViewById(R.id.txtid);

        //variable.setText(_productId);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
}
