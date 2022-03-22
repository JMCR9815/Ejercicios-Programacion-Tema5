package Cola;

import Persona.Persona;

public class cola {
    private Persona[] personas;

    public cola(Persona[] personas) {
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
