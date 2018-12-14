package com.example.cabina10.latinoapp.activities;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.cabina10.latinoapp.R;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    Button btnDateNac;
    Button btnQty;
    Calendar calendar;
    String cero="0";
    String slash="/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnDateNac=(Button) findViewById(R.id.btnFechaNac);
        calendar=Calendar.getInstance();


        btnDateNac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog recogerFecha =new DatePickerDialog(RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        final int mesActual=month+1;
                        String diaFormateado=dayOfMonth+1;
                    }
                })


            }
        });
    }
}
