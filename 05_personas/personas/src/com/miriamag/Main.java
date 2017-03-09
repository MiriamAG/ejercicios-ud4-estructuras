package com.miriamag;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Persona> A = new HashSet<>();

        A.add(new Persona("Ion1","1"));
        A.add(new Persona("Ion2","2"));
        A.add(new Persona("Ion3","3"));
        A.add(new Persona("Ion4","4"));
        A.add(new Persona("Ion5","5"));

        Set<Persona> B = new HashSet<>();

        B.add(new Persona("Iñaki1","11"));
        B.add(new Persona("Iñaki2","12"));
        B.add(new Persona("Iñaki3","13"));
        B.add(new Persona("Iñaki4","14"));
        B.add(new Persona("Iñaki5","15"));

        //para evitar que A se llene con los dos datos se hace un tercer conjunto

        Set<Persona> caso1 = new HashSet<>();

        /*Set<Persona> caso1 = new HashSet<>(A) crea un conjunto a partir de otro
        caso1.addAll(B); aquí se le añade el B
        */

        caso1.addAll(A);
        caso1.addAll(B);

        /*
        // juntar los dos conjuntos sin duplicados

        A.addAll(B);//pero A se queda con todos los datos y el B los de B


        //para mostrar el conjunta A. Aquí se ven sin repetidos pero A ya no tiene 5 si no 10
        for (Persona p: A) {
            System.out.println(p);
        }
            */

        for (Persona p: caso1) {
            System.out.println(p);
        }

        //Union admitiendo duplicados

        List<Persona> caso2 = new ArrayList<>(A);

        caso2.addAll(B);//aqui se tiene la lista de los dos con duplicados, porque el List admite duplicados

        for (Persona p: caso2) {
            System.out.println(p);
        }

        //personas del primer conjunto que no esté en el segundo (diferencia)

        Set<Persona> caso3 = new HashSet<>(A);

        caso3.removeAll(B);

        for (Persona p: caso3) {
            System.out.println(p);
        }

        //Interseccion


        Set<Persona> caso4 = new HashSet<>(A);

        caso3.retainAll(B);

        for (Persona p: caso4) {
            System.out.println(p);
        }


    }
}
