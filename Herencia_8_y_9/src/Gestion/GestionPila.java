package Gestion;

import Interfaz.interfaz;
import Persona.Persona;
import Pila.Pila;

import static java.lang.System.arraycopy;

public class GestionPila implements interfaz {
    int size = 6;
    Persona[] persona = new Persona[size];
    Pila pila;

    public void llenarArray() {
        for (int i = 0; i < persona.length; i++) {
            persona[i] = new Persona("" + i, "Nombre " + i);

        }
        pila = new Pila(persona);
    }

    @Override
    public boolean estaVacia() {
        boolean bandera = false;
        Persona[] personas = pila.getPersonas();
        for (Persona value : personas) {
            if (value != null) {
                bandera = true;
            }
        }
        return bandera;
    }

    @Override
    public Persona primero() {
        Persona[] personas = pila.getPersonas();
        if (personas[0] != null) {
            return personas[0];
        }
        return null;
    }

    @Override
    public Persona extraer() {
        int posicionPersona;
        Persona[] personas = pila.getPersonas();
        posicionPersona = persona.length - 1;
        Persona personaElemento = personas[posicionPersona];
        Persona[] personas2 = new Persona[pila.getPersonas().length];
        arraycopy(personas, 0, personas2, 0, personas.length - 1);

//        for (int i = 0; i < personas.length; i++) {
//            for (int j = personas.length; j >= personas.length; j--) {
//                personas2[i] = personas[j - 1];
//            }
//        }
        pila.setPersonas(personas2);

        return personaElemento;


    }

    @Override
    public boolean insertar(String id, String nombre) {
        Persona[] personas = pila.getPersonas();
        boolean bandera = false;
        for (int i = 1; i < personas.length; i++) {
            if (personas[i] == null) {
                bandera = true;
                personas[i] = new Persona(id, nombre);
            }
        }
        pila.setPersonas(personas);

        return bandera;
    }

    @Override
    public void mostrar() {
        Persona[] personas = pila.getPersonas();
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                i++;
            } else {
                System.out.println(personas[i].toString());
            }

        }
    }
}
