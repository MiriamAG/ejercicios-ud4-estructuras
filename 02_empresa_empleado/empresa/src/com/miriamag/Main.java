package com.miriamag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        Empresa e = new Empresa();

        //Se crea el listado de empresas diferentes

        List<Empresa> listaEmpresas = new ArrayList<>();


        do {
            System.out.println("1. Crear nueva empresa.\n" +
                    "2. Añadir empleado a empresa ya existente.\n" +
                    "3. Listado de empresas.\n" +
                    "4. Listado detallado de empresas y empleados.\n" +
                    "5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());


            switch (opcion) {
                case 1:
                    //crear empresa nueva

                    System.out.println("Nombre empresa: ");
                    String nombre = br.readLine();

                    System.out.println("Año de fundación: ");
                    String anyo = br.readLine();

                    e = new Empresa(nombre, anyo);//esta estructura para crear un dato nuevo

                    //guardar empresa en el array empresas
                    listaEmpresas.add(e);
                    break;

                case 2:
                    //añadir empleado a empresa existente
                    if (listaEmpresas.size() > 0) {//hay empresa?

                        //mostrarle la lista de empresas existentes
                        for (int i = 0; i < listaEmpresas.size(); i++) {
                            System.out.println((i + 1) + ", " + listaEmpresas.get(i));//mostrarle las listas con numeracion
                        }
                        System.out.println("Elige una empresa a la que añadir empleados: ");
                        int numEmpresa = Integer.parseInt(br.readLine()) - 1;// se quita el -1 porque antes al mostrar hemos añadido 1


                        //datos del empleado
                        Empleado emple = new Empleado();
                        System.out.println("Nombre de empleado: ");
                        String nombreE = (br.readLine());
                        //validacion...
                        emple.setNombre(nombreE);

                        System.out.println("Apellido de emplreado: ");
                        String apellido = (br.readLine());
                        //validacion...
                        emple.setApellidos(apellido);

                        System.out.println("Fecha nacimiento: ");
                        String fechaNac = (br.readLine());
                        //validacion...
                        emple.setFechaNacimiento(fechaNac);

                        System.out.println("Fecha contrato: ");
                        String fechaCon = (br.readLine());
                        //validacion...
                        emple.setFechaContrato(fechaCon);

                        //guardamos en la posicion numEmpresa, el empleado
                        listaEmpresas.get(numEmpresa).añadirEmpleado(emple);//de la lista de empresas, pásame el de la posicion numEm

                    } else {
                        System.out.println("ERROR: Da de alta una empresa primero.");
                    }
                    break;

                case 3:
                    //visualizar la lista de empresas (Solo con el nombre)

                    for (Empresa em : listaEmpresas) {
                        System.out.println(em);//porque está implementado el toString
                    }
                    break;

                case 4:
                    //mostrar listado de empresas y empleados.

                    for (Empresa em : listaEmpresas) {
                        em.visualizarEmpresa();
                    }
                    break;

                case 5:
                    System.out.println("BB");
                    break;
                default:
                    System.err.println("Opcion no válida.");
                    break;
            }
        } while (opcion != 5 && opcion < 5);
    }
}
