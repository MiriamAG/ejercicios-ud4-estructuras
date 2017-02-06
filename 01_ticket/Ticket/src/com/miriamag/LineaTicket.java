package com.miriamag;

/**
 * Created by 7FPROG11 on 06/02/2017.
 */
public class LineaTicket {

    private String producto;
    private Double precioU;
    private int numU;

    private Ticket ticket;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(Double precioU) {
        this.precioU = precioU;
    }

    public int getNumU() {
        return numU;
    }

    public void setNumU(int numU) {
        this.numU = numU;
    }

    public LineaTicket(String producto, Double precioU, int numU) {
        this.producto = producto;
        this.precioU = precioU;
        this.numU = numU;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //se crea en la propia linea el total

    public double getTotal(){

        return precioU*numU;
    }

    @Override
    public String toString() {
        return "LineaTicket{" +
                "producto='" + producto + '\'' +
                ", precioU=" + precioU +
                ", numU=" + numU +
                '}';
    }
}
