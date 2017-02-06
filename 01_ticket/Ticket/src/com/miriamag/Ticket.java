package com.miriamag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG11 on 06/02/2017.
 */
public class Ticket {

    private List<LineaTicket> olakase = new ArrayList<>();

public void añadirLinea(LineaTicket l){
    olakase.add(l);
    l.setTicket(this);
}

//implementacion de mostrar la lista

    double total =0.0;
    public void imprimir(){
        for (LineaTicket l: olakase) {
            System.out.println(l+", total: "+l.getTotal());
            total += l.getTotal();
        }
        System.out.println("Total a pagar: "+total);
    }


}
