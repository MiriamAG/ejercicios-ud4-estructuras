package com.miriamag;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 7FPROG11 on 13/02/2017.
 */
public class Asignatura {

    private String nombre;
    private double horasSemanales;

    private List<Alumno> alumnos = new LinkedList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(double horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Asignatura() {}

    public Asignatura(String nombre, double horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }




}
