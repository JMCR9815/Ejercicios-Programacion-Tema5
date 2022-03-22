package App;

import java.time.LocalDate;

public class Alquiler {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("44444444 A", "Cliente1", "Apellidos1", 924587869);
        Vehiculo vehiculo1 = new Vehiculo("1539-HDD", "Mazda", "CX-5", 15.5, true);
        VehiculoAlquilado vehiculoALQ = new VehiculoAlquilado(cliente1, vehiculo1, LocalDate.now(), 20);
        System.out.println("El importe total del alquiler es de : " + vehiculoALQ.getImporteTotal() + "$");
        System.out.println("Vehiculo Alquilado: " + vehiculoALQ.getVehiculo().getMarca() + ", " + vehiculoALQ.getVehiculo().getModelo());
        System.out.println("Alquilado por: " + vehiculoALQ.getCliente().getNombre());
    }
}
