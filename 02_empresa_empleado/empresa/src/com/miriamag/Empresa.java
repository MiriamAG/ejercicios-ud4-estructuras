package com.miriamag;

import java.util.ArrayList;

/**
 * Created by 7FPROG11 on 09/02/2017.
 */
public class Empresa {

    private String nombre;
    private String anyoFundacion;

    //asociacion lado 1.

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public Empresa() {}

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public void añadirEmpleado(Empleado empleado){
        empleados.add(empleado);
        empleado.setEmpresa(this);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void listaEmpleados(){
        for (Empleado ea:empleados) {

            System.out.println("Nombre: "+ea.getNombre());
            System.out.println("Apellido: "+ea.getApellidos());
            System.out.println("Fecha nacimiento: "+ea.getFechaNacimiento());
            System.out.println("Fecha Contrato: "+ea.getFechaContrato());

        }

    }



}
