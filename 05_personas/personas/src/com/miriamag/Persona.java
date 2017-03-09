package com.miriamag;

/**
 * Created by 7FPROG11 on 02/03/2017.
 */
public class Persona {


        private String DNI;
        private String nombre;


        public Persona(String DNI, String nombre) {
            this.DNI = DNI;
            this.nombre = nombre;
        }

        public String getDNI() {
            return DNI;
        }

        public void setDNI(String DNI) {
            this.DNI = DNI;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "DNI='" + DNI + '\'' +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;//tienen la misma referencia?
            if (o == null || getClass() != o.getClass()) return false;//si no hay objeto o es de otra clase, son falso

            Persona persona = (Persona) o;

            //? si return dni!= hace el primero, si no persona.dni ==null
            return DNI != null ? DNI.equals(persona.DNI) : persona.DNI == null;

        }

        @Override
        public int hashCode() {
            return DNI != null ? DNI.hashCode() : 0;
        }
    }


