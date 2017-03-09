package com.miriamag;

/**
 * Created by 7FPROG11 on 09/03/2017.
 */
public class Apunte {


    private double cantidad;
    private String fecha;

    private CuentaBancaria cuenta;

    public Apunte(double cantidad, String fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Apunte() {
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Apunte{" +
                "cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                '}';


    }
}