package GestionProductos;

import Productos.PreoductosCongelados;
import Productos.Productos;
import Productos.ProductosFrescos;
import Productos.ProductosRefrigerados;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gestion {
    int size = 6;
    ArrayList<Productos> listaPreoductos = new ArrayList<>(size);

    public void crearProductos() {

        for (int i = 0; i < size; i++) {
            if (i <= 1) {
                listaPreoductos.add(new ProductosFrescos(i, "Descripcion" + i, LocalDate.of(2020, 02, 15), 1000 + i, LocalDate.of(2020, 02, 26), "ESP"));
            }
            if (i > 1 && i < 4) {
                listaPreoductos.add(new ProductosRefrigerados(i, "Descripcion" + i, LocalDate.of(2024, 05, 18), 1000 + (i), 4850 + i));
            }
            if (i >= 4) {
                listaPreoductos.add(new PreoductosCongelados(i, "Descripcion" + i, LocalDate.of(2024, 05, 20), 1000 + i, -5.00));
            }
        }
    }


    public void mostarProductos() {
        for (Productos producto1 : listaPreoductos) {
            String toString = producto1.toString();
            System.out.println(toString);
        }

//        IntStream.range(0, listaPreoductos.size()).forEach(i -> {
//            System.out.println(listaPreoductos.get(i).toString());
//        });
    }

}
