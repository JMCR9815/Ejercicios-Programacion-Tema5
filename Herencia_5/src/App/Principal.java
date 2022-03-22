package App;

import Vehiculos.Vehiculos;

public class Principal {

    public static void main(String[] args) {
        Vehiculos gestionVehiculos = new Vehiculos();
        gestionVehiculos.crearVehiculos();
        gestionVehiculos.mostarListaVehiculos();

    }
}
