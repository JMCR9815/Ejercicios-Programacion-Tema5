package Persona;

public class Persona {
    private String id;
    private String nombre;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNull() {
        setId(null);
        setNombre(null);
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}
