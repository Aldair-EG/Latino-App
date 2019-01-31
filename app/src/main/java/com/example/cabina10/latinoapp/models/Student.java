package com.example.cabina10.latinoapp.models;
import java.sql.Struct;
import java.util.Date;
import java.util.ArrayList;

public class Student {
    int idStudent, DNI;
    String Nombres, ApPaterno, ApMaterno, Domicilio, Correo, Telefono;
    Date FechaNacimiento;

    public Student(int _idStudent, int _DNI, String _Telefono, String _name, String _Paterno, String _Materno, String _Domicilio, String _Correo, Date _FechaNacimiento) {
        this.idStudent = _idStudent;
        this.DNI = _DNI;
        this.Telefono = _Telefono;
        this.Nombres = _name;
        this.ApPaterno = _Paterno;
        this.ApMaterno = _Materno;
        this.Domicilio = _Domicilio;
        this.Correo = _Correo;
        this.FechaNacimiento = _FechaNacimiento;
    }

    public String getDNI() { return String.format("%s", this.DNI); }
    public String getTelefono() { return this.Telefono; }
    public String getNombres() { return this.Nombres; }
    public String getApPaterno() { return this.ApPaterno; }
    public String getApMaterno() { return this.ApMaterno; }
    public String getDomicilio() { return this.Domicilio; }
    public String getCorreo() { return this.Correo; }
    public String getFechaNacimiento() { return this.FechaNacimiento.toString(); }

    public static ArrayList<Student> getStudents() {
        ArrayList<Student> _list = new ArrayList<>();
        _list.add(new Student(001, 73568985, "955689875", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        _list.add(new Student(001, 73568985, "936452356", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        _list.add(new Student(001, 73568985, "956485232", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        _list.add(new Student(001, 73568985, "978562356", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        return _list;
    }
}
