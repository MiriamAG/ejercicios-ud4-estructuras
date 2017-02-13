package com.miriamag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG11 on 09/02/2017.
 */
public class Empresa {

    private String nombre;
    private String anyoFundacion;

    //asociacion lado 1.

    private List<Empleado> empleados = new ArrayList<>();


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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyoFundacion='" + anyoFundacion + '\'' +
                '}';
    }

    public void visualizarEmpresa(){
        System.out.println("Datos de la empresa: "+nombre);
        System.out.println("Año de fundación: "+anyoFundacion);
        System.out.println("Lista de empleados: ");

        for (Empleado e :empleados) {
            System.out.println("Nombre: "+e.getNombre());
            System.out.println("Apellido: "+e.getApellidos());
            System.out.println("Fecha nacimiento: "+e.getFechaNacimiento());
            System.out.println("Fecha Contrato: "+e.getFechaContrato());


        }
    }

}
