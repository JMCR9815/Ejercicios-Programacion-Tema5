package Gestion;

import Persona.Persona;

public class PrincipalPila {
    public static void main(String[] args) {
        GestionPila gestionPila = new GestionPila();
        gestionPila.llenarArray();
        Persona personaPrimero = gestionPila.primero();
        Persona personaExtraer = gestionPila.extraer();
        //gestionCola.mostarArrayPersonas();
        if (!gestionPila.estaVacia()) {
            System.err.println("La estructura no esta vacia");
        } else {
            System.out.println("Estructura Vacia");
        }
        System.out.println();

        System.out.println("Mostrando el primer elemento...");
        if (personaPrimero != null) {
            System.out.println("Elemento: " + personaPrimero);
        } else {
            System.err.println("Error: El elemento es nulo");
        }
        System.out.println();
        System.out.println("Extrayendo  elemento...");
        if (personaExtraer != null) {
            System.out.println("Elemento: " + personaExtraer);
            System.out.println("Elemento extraido");
        } else {
            System.err.println("Elemento nulo");
        }
        System.out.println();
        if (gestionPila.insertar(" 6", "Nombre 6")) {
            System.out.println("hay una posicion libre");
            System.out.println("Añadiendo nuevo elemento a la lista...");
        } else {
            System.err.println("No quedan posiciones libres");
        }
        System.out.println();
        gestionPila.mostrar();
    }
}
