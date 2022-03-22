package Ejemplo;

public class Trabajador {
    private String nombre, apellido, puesto, direccion, telefono, numSecSoc;
    private double salario_base;

    public Trabajador(String nombre, String apellido, String puesto, String direccion, String telefono, String numSecSoc, double salario_base) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numSecSoc = numSecSoc;
        this.salario_base = salario_base;
    }

    public Trabajador(String nombre, String apellido, String puesto, String direccion, String telefono, String numSecSoc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numSecSoc = numSecSoc;
    }

    public double calcularPaga() {
        return this.salario_base;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumSecSoc() {
        return numSecSoc;
    }

    public void setNumSecSoc(String numSecSoc) {
        this.numSecSoc = numSecSoc;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", puesto='" + puesto + '\'' + ", direccion='" + direccion + '\'' + ", telefono='" + telefono + '\'' + ", numSecSoc='" + numSecSoc + '\'' + '}';
    }

}
