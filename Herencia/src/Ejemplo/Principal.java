package Ejemplo;

public class Principal {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Empleado1", "Apellido1", "Puesto1", "Direccion1", "Telefono1", "Num Secsoc", 1200.00, 15.00);
        Trabajador trabajador = new Trabajador("Trabajador1", "ApellidosTrabajador", "Puesto2", "Direccion2", "Telefono2", "NumSecSoc2", 30000.00);

        System.out.println(empleado);
        System.out.println("el calculo de las pagas de empleado: " + empleado.calcularPagas());
        System.out.println(trabajador);
        saludar(trabajador);
        nombreYpagas(trabajador);
    }

    public static void saludar(Trabajador trabajador) {
        System.out.println("Hola, " + trabajador.getNombre());
    }

    public static void nombreYpagas(Trabajador trabajador) {
        System.out.println("HOla, " + trabajador.getNombre() + ": " + trabajador.calcularPaga());

    }

}

