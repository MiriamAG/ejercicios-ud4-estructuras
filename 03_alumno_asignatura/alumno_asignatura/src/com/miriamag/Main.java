package com.miriamag;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Asignatura> as = new LinkedList<>();
        List<Alumno> al = new LinkedList<>();

        System.out.println("1. Crear nuevo alumno.\n" +
                "2. Crear nueva asignatura.\n" +
                "3. Matricular alumno en asignatura.\n" +
                "4. Listado de alumnos matriculados en una asignatura.\n" +
                "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                "6. Salir");
        System.out.print("Opción: ");

        int opcion = Integer.parseInt(br.readLine());


        switch (opcion){
            case 1:
                //CREAR NUEVO ALUMNO
                Alumno alumno = new Alumno();

                //pedir datos
                System.out.println("Nombre del alumno: ");
                String nombreA= br.readLine();
                //validacion....
                alumno.setNombre(nombreA);

                System.out.println("Apellidos: ");
                String apellido = br.readLine();
                //validacion...
                alumno.setApellidos(apellido);

                System.out.println("e-mail: ");
                String email = br.readLine();
                //validacion
                alumno.setEmail(email);

                //guardar en la lista de all, el nuevo alumno
                al.add(alumno);

                break;
            case 2:
                //CREAR NUEVA ASIGNATURA

                Asignatura asignatura = new Asignatura();

                //pedir datos de la asignatura

                System.out.println("Nombre de la asignatura: ");
                String nombreAs = br.readLine();
                //validacion

                asignatura.setNombre(nombreAs);

                System.out.println("Horas a la semana: ");
                double horasSem = Double.parseDouble(br.readLine());
                //validacion

                asignatura.setHorasSemanales(horasSem);

                //guardar en la lista de asignaturas la asignatura nueva

                as.add(asignatura);
                break;
            case 3:
                //MATRICULAR UN ALUMNO EN UNA ASIGNATURA
                //qué alumno?

                alumno = null;
                asignatura = null;

                if (al.size()>0){
                    for (int i = 0; i <al.size() ; i++) {
                        System.out.println((i+1)+", "+al);
                    }
                    System.out.println("¿Qué alumno quiere matricular? ");
                    int numAlumno = Integer.parseInt(br.readLine())-1;
                    alumno = al.get(numAlumno);

                }else{
                    System.out.println("No hay alumnos matriculados.");
                }

                if (as.size()>0){
                    for (int i = 0; i <as.size() ; i++) {
                        System.out.println((i+1)+", "+as);
                    }
                    System.out.println("¿A qué asignatura quiere matricular al alumno?");
                    int numAsignatura = Integer.parseInt(br.readLine())-1;
                    asignatura = as.get(numAsignatura);


                }else{
                    System.out.println("No hay asignaturas.");
                }
                //estructura de control, si no han puesto nada, no se añade

                if( alumno != null && asignatura != null ) {
                    alumno.getAsignaturas().add(asignatura);
                    asignatura.getAlumnos().add(alumno);
                }

                break;
            case 4:
                //listado de alumnos matriculados en una asignatura


                break;
            case 5:
                //listado de asignaturas en las que esta matriculado un alumno y las horas.
                break;
            case 6:
                break;




        }






    }
}
