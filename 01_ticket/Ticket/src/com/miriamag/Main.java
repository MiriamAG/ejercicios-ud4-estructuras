package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       /* Diseña el diagrama de clases y escribe el programa para almacenar un ticket de supermercado, mediante las
       clases Ticket y LineaTicket.

       El usuario introduce el nombre del producto, el precio por unidad y el número de unidades, sin límite,
       hasta que nos responda que ha terminado.

       El programa sacará en pantalla el listado con el nombre de cada producto, las unidades vendidas y el precio
       total.

       Además, mostrará el total que resulte de sumar todas las líneas del ticket.*/







       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char otro;

        //generamos el ticket
        Ticket t = new Ticket();

        do {

            //pedir datos

            System.out.println("Introduzca el producto: ");
            String nombre = br.readLine();

            System.out.println("Introduce precio: ");
            double precio = Double.parseDouble(br.readLine());

            System.out.println("Introduce cantidad: ");
            int cantidad = Integer.parseInt(br.readLine());

            //se crea una linea con los datos pedidos

            LineaTicket a = new LineaTicket(nombre,precio,cantidad);

            //se guardan esos datos en el Ticket

            t.añadirLinea(a);

            System.out.println("¿Otro? (s/n)");
            otro = br.readLine().charAt(0);

        } while (otro != 'n');
        t.imprimir();

    }
}
