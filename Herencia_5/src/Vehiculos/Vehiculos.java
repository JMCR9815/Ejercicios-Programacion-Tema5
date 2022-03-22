package Vehiculos;

import App.Fragoneta;
import App.Vehiculo;
import App.turismo;

import java.util.ArrayList;

public class Vehiculos {
    //    private Vehiculo[] vehiculo = new Vehiculo[10];
    int size = 10;
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>(size);

    public void crearVehiculos() {
        for (int i = 0; i < size; i++) {
            if (i < 5) {
                listaVehiculos.add(i, new turismo("Matricula" + i, "Marca" + i, "Modelo" + i, 0.00, true, 5, false));
            } else {
                listaVehiculos.add(i, new Fragoneta("Matricula" + i, "Marca" + i, "Modelo" + i, 0.00, false, 80, 100));
            }

        }
    }

    public void mostarListaVehiculos() {
        for (Vehiculo vehiculo1 : listaVehiculos) {
            String toString = vehiculo1.toString();
            System.out.println(toString);
        }
    }
}
