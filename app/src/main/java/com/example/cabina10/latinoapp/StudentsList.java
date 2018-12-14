package com.example.cabina10.latinoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cabina10.latinoapp.activities.RegisterForm;
import com.example.cabina10.latinoapp.adapters.StudentAdapter;
import com.example.cabina10.latinoapp.models.Student;
import java.util.ArrayList;

public class StudentsList extends AppCompatActivity {

    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        //ICONO EN EL ACTION BAR
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        lv1 = (ListView)findViewById(R.id.lv1);

        //LISTAR LOS ESTUDIANTES
        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayList<Student> items = Student.getStudents();
        StudentAdapter studentAdapter = new StudentAdapter(this, R.id.lv1, items);
        lv1.setAdapter(studentAdapter);

        /*lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Student selItem = (Student) adapter.getItemAtPosition(position);
                if ( selItem != null ) {
                    Intent o = new Intent(StudentsList.this, StudentDetails.class);
                    o.putExtra("productId", selItem.getId());

                    startActivity(o);
                   //Log.d(Settings.DEBUG, "La aplicacion dijo: " + selItem.getName());
                }
            }
        });*/

    }

    //Metodo para mostrar y ocultar Menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.administratormenu, menu);
        return true;
    }

    //METODO PARA IR A StudentDetails
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, StudentDetails.class);
        startActivity(siguiente);
    }

    //Metodo para crear funciones a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.itema4){
            Intent siguiente = new Intent(this, RegisterForm.class);
            startActivity(siguiente);
        }
        return super.onOptionsItemSelected(item);
    }
}
