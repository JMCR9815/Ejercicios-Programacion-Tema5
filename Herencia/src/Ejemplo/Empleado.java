package Ejemplo;

public class Empleado extends Trabajador {
    private final int PAGAS = 14;
    private final double sueldo;
    private final double impuestos;

    public Empleado(String nombre, String apellido, String puesto, String direccion, String telefono, String numSecSoc, double sueldo, double impuestos) {
        super(nombre, apellido, puesto, direccion, telefono, numSecSoc);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + getNombre() + '\'' + ", apellido='" + getApellido() + '\'' + ", puesto='" + getPuesto() + '\'' + ", direccion='" + getDireccion() + '\'' + ", telefono='" + getTelefono() + '\'' + ", numSecSoc='" + getNumSecSoc() + '\'' + "sueldo: " + sueldo + " impuestos: " + impuestos + '}';
    }

    public double calcularPagas() {
        return (sueldo - impuestos) / PAGAS;
    }

}
