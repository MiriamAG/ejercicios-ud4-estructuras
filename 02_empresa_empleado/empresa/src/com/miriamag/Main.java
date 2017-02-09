package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion =0;
        List<Empresa> empresas = new ArrayList<>();

        Empresa e = new Empresa();

        do {
            System.out.println("1. Crear nueva empresa.\n" +
                    "2. Añadir empleado a empresa ya existente.\n" +
                    "3. Listado de empresas.\n" +
                    "4. Listado detallado de empresas y empleados.\n" +
                    "5. Salir");

            opcion = Integer.parseInt(br.readLine());


            //Se crea el listado de empresas diferentes


            //crear empresa nueva
            switch (opcion) {
                case 1:
                    System.out.println("Nombre empresa: ");
                    String nombre = br.readLine();

                    System.out.println("Año de fundación: ");
                    String anyo = br.readLine();

                    e = new Empresa(nombre, anyo);//esta estructura para crear un dato nuevo

                    //guardar empresa en el array empresas
                    empresas.add(e);
                    break;

                case 2:
                    //añadir empleado a empresa existente


                    System.out.println("Nombre de empleado: ");
                    String nombreE =(br.readLine());
                    System.out.println("Apellido de emplreado: ");
                    String apellido=(br.readLine());
                    System.out.println("Fecha nacimiento: ");
                    String fechaNac=(br.readLine());
                    System.out.println("Fecha contrato: ");
                    String fechaCon=(br.readLine());

                    e.añadirEmpleado(new Empleado(nombreE,apellido,fechaNac,fechaCon));
                    break;

                case 3:
                    //visualizar la lista de empresas (Solo con el nombre)

                    for (Empresa em : empresas) {
                        System.out.println("Nombre de empresa: " + em.getNombre());
                    }
                    break;

                case 4:
                    //mostrar listado de empresas y empleados.

                    for (Empresa em : empresas) {

                        System.out.println("Nombre empresa: " + em.getNombre());
                        System.out.println("Lista de empleados: ");
                        em.listaEmpleados();
                    }
                    break;

                case 5:
                    System.out.println("BB");
                    break;
            }
        } while (opcion!=5 && opcion<5);
    }
}
