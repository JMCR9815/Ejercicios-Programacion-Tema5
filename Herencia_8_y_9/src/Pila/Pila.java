package Pila;

import Persona.Persona;

public class Pila {
    private Persona[] personas;

    public Pila(Persona[] personas) {
        this.personas = personas;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }


    @Override
    public String toString() {
        return "cola{" + "personas=" + super.toString() + '}';
    }
}

