package App;

public class Cliente {
    private String DNI, nombre;
    private int telf;

    public Cliente(String DNI, String nombre, int telf) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.telf = telf;
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

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI='" + DNI + '\'' + ", nombre='" + nombre + '\'' + ", telf=" + telf + '}';
    }
}
