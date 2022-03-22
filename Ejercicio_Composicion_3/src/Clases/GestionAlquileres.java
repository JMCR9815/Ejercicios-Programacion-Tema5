package Clases;

import java.time.LocalDate;

public class GestionAlquileres {
    private final VehiculoAlquilado[] alquilados = new VehiculoAlquilado[7];


    public GestionAlquileres() {
        alquilados[0] = new VehiculoAlquilado(new Cliente(1, "Ana", "Robles Paz"), new Vehiculo("1200-BMC", "Seat", "Ibiza", 20, true), LocalDate.now(), 5);
        alquilados[1] = new VehiculoAlquilado(new Cliente(2, "Luis", "Santo Paz"), new Vehiculo("1111-BMC", "Renault", "Clio", 25, true), LocalDate.now(), 1);
        alquilados[2] = new VehiculoAlquilado(new Cliente(3, "Gema", "D�az Paz"), new Vehiculo("1233-BMC", "Seat", "Ibiza", 20, true), LocalDate.now(), 9);
        alquilados[3] = new VehiculoAlquilado(new Cliente(4, "Tom�s", "Sanz Eno"), new Vehiculo("1290-BMC", "Volvo", "XC90", 120, true), LocalDate.now(), 11);
        alquilados[4] = new VehiculoAlquilado(new Cliente(5, "Eva", "Cansino Roble"), new Vehiculo("9090-BMC", "Volkswagen", "Golf", 34, true), LocalDate.now(), 10);
        alquilados[5] = new VehiculoAlquilado(new Cliente(5, "Eva", "Cansino Roble"), new Vehiculo("9091-BMC", "Volkswagen", "Passat", 54, true), LocalDate.of(2021, 1, 14), 10);
        alquilados[6] = new VehiculoAlquilado(new Cliente(5, "Eva", "Cansino Roble"), new Vehiculo("1200-BMC", "Seat", "Ibiza", 20, true), LocalDate.of(2021, 1, 1), 10);
    }

    public Cliente getClienteAlquiler(String matricula) {
        for (VehiculoAlquilado alquilado : alquilados) {
            if (alquilado.getVehiculo().getMatricula().equals(matricula)) {
                return alquilado.getCliente();
            }
        }
        return null;
    }

    public int contarAlquileresCliente(int idCliente) {
        int cantidadAlquileres = 0;
        for (VehiculoAlquilado alquilado : alquilados) {
            if (alquilado.getCliente().getId() == idCliente) {
                cantidadAlquileres++;
            }
        }
        return cantidadAlquileres;
    }

    public double sumaImporteTodosAlquileres() {
        double sumaAlquileresTotal = 0;
        for (VehiculoAlquilado alquilado : alquilados) {
            sumaAlquileresTotal = sumaAlquileresTotal + alquilado.getImporteAlquiler();
        }

        return sumaAlquileresTotal;
    }

    public void mostrarAlquileresMatricula(String matricula) {
        int contadorAlquileres = 0;
        for (VehiculoAlquilado alquilado : alquilados) {
            if (alquilado.getVehiculo().getMatricula().equals(matricula)) {
                contadorAlquileres++;
            }
        }
        System.out.println("La matricula " + matricula + " tiene " + contadorAlquileres + " alquileres activos actualmente");
    }
}
