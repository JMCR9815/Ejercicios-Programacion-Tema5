package Gestion;

import Cola.cola;
import Interfaz.interfaz;
import Persona.Persona;

import static java.lang.System.arraycopy;

public class GestionCola implements interfaz {
    int size = 6;
    Persona[] persona = new Persona[size];
    cola cola;

    public void llenarArrayPersona() {

        for (int i = 0; i < persona.length; i++) {
            persona[i] = new Persona(" " + i, "Nombre " + i);
        }
        cola = new cola(persona);

    }

    public void mostarArrayPersonas() {

    }


    @Override
    public boolean estaVacia() {
        boolean bandera = false;
        Persona[] personas = cola.getPersonas();
        for (Persona value : personas) {
            if (value == null) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    @Override
    public Persona primero() {
        Persona[] personas = cola.getPersonas();
        if (personas[0] != null) {
            return personas[0];
        }
        return null;
    }

    @Override
    public Persona extraer() {
        Persona[] personas = cola.getPersonas();
        int posicionPersona = 0;
        Persona personaElemento = personas[posicionPersona];

        Persona[] personas2 = new Persona[cola.getPersonas().length + 1];
        arraycopy(personas, posicionPersona, personas2, posicionPersona, personas.length);
        cola.setPersonas(personas2);

        return personaElemento;

    }

    @Override
    public boolean insertar(String id, String nombre) {
        Persona[] personas = cola.getPersonas();
        int lastIndex = personas.length - 1;
        boolean bandera = false;
        for (int i = 0; i < personas.length; i++) {
            if (personas[lastIndex] == null) {
                bandera = true;
                personas[lastIndex] = new Persona(id, nombre);
            }
        }
        cola.setPersonas(personas);
        return bandera;
    }

    @Override
    public void mostrar() {
        Persona[] personas = cola.getPersonas();
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                i++;
            } else {
                System.out.println(personas[i].toString());
            }

        }

    }
}
