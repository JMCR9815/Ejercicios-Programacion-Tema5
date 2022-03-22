package Gestion;

import Persona.Persona;

public class PrincipalCola {

    public static void main(String[] args) {
        GestionCola gestionCola = new GestionCola();
        gestionCola.llenarArrayPersona();
        //gestionCola.mostarArrayPersonas();
        if (!gestionCola.estaVacia()) {
            System.err.println("La estructura no esta vacia");
        } else {
            System.out.println("Estructura Vacia");
        }
        System.out.println();

        System.out.println("Mostrando el primer elemento...");
        Persona personaPrimero = gestionCola.primero();
        if (personaPrimero != null) {
            System.out.println("Elemento: " + personaPrimero);
        } else {
            System.err.println("Error: El elemento es nulo");
        }
        System.out.println();

        System.out.println("Extrayendo  elemento...");
        Persona personaExtraer = gestionCola.extraer();
        if (personaExtraer != null) {
            System.out.println("Elemento: " + personaExtraer);
            System.out.println("Elemento extraido");

        } else {
            System.err.println("Elemento nulo");
        }
        System.out.println();
        if (gestionCola.insertar(" 6", "Nombre 6")) {
            System.out.println("hay una posicion libre");
            System.out.println("Añadiendo nuevo elemento a la lista...");
        } else {
            System.err.println("No quedan posiciones libres");
        }
        System.out.println();
        gestionCola.mostrar();


    }
}
