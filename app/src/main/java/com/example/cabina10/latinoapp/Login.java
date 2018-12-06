package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
/// Marcelo estuvo aquí
public class Login extends AppCompatActivity {

    private EditText etn, etp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        etn = (EditText)findViewById(R.id.txt_Nombre);
        etp = (EditText)findViewById(R.id.txt_Contrasenia);

        //AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "BD", null, 1);
        //SQLiteDatabase BD  = admin.getWritableDatabase();
    }
    //METODO PARA INICIAR SESION
    public void Ingresar(View view){
        String nombre = etn.getText().toString();
        String contrasenia = etp.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(this, "Ingrese un nombre de Usuario", Toast.LENGTH_SHORT).show();
            etn.requestFocus();
            InputMethodManager inm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            inm.showSoftInput(etn, InputMethodManager.SHOW_IMPLICIT);
        }else
        if (contrasenia.length() == 0){
            Toast.makeText(this, "Ingrese una Contraseña", Toast.LENGTH_SHORT).show();
            etp.requestFocus();
            InputMethodManager inm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            inm.showSoftInput(etp, InputMethodManager.SHOW_IMPLICIT);
        }else
        if (!nombre.equals("")){
            Toast.makeText(this, "Hola " + nombre, Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(this, StudentsList.class);
            siguiente.putExtra("Estudiante", nombre);
            startActivity(siguiente);
            finish();
        }
    }

    @Override
    public void onBackPressed(){

    }
}
