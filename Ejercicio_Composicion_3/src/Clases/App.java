package Clases;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GestionAlquileres gestion = new GestionAlquileres();
//        Cliente cliente = new Cliente(1, "Ana", "Robles Paz");
//        Vehiculo vehiculo = new Vehiculo("1200-BMC", "Seat", "Ibiza", 45.4, true);
//
//        VehiculoAlquilado ve1 = new VehiculoAlquilado(cliente, vehiculo, LocalDate.now(), 5);
//
//        VehiculoAlquilado ve2 = new VehiculoAlquilado(new Cliente(2, "Luis", "Alma Olmo"), new Vehiculo("3888-jkk", "Ford", "Fiesta", 30.0, true), LocalDate.now(), 15);
//
//        System.out.println("Qui�n alquil� el veh�culo 1: " + ve1.getCliente().getNombreCompleto());
//        System.out.println("Importe alquile vehiculo 2: " + ve2.getImporteAlquiler());
//        System.out.println();
//        System.out.println(ve1.toString());
        String matricula = "1200-BMC";
        int clientID = 5;
        System.out.println("El cliente que alquilo el coche con matricula: " + matricula + ", es : " + gestion.getClienteAlquiler(matricula));
        System.out.println();
        System.out.println("El cliente con ID " + clientID + ", tiene " + gestion.contarAlquileresCliente(clientID) + " alquileres activos");
        System.out.println();
        System.out.println("El importe total de todos los alquileres vigentes es de: " + gestion.sumaImporteTodosAlquileres() + "$");
        System.out.println();
        gestion.mostrarAlquileresMatricula("1200-BMC");
    }


}
