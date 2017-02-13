package com.miriamag;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 7FPROG11 on 13/02/2017.
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;
    private List<Asignatura> asignaturas= new LinkedList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Alumno() {}

    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;

    }

    public double horasTotal(){
        return 0;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
