package GestionProductos;

import Interfaz.ProductosIF;
import Menu.Menu;
import Productos.Congelados;
import Productos.Frescos;
import Productos.Productos;
import Productos.Refrigerados;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Gestion implements ProductosIF {


    String[] opcionesMenu = {"1. Mostar lista de productos).", "2. Modificar temperatura de congelacion (indicar id del producto y el nuevo valor de temperatura)", "3. Mostrar productos de un pais (indicar el pais)", "4. Mostar productos caducados ", "5. Mostar productos por tipo de producto (indica el parametro de busqueda)", "6. Salir"};
    String[] paises = {"España", "Italia", "Marruecos", "Argelia", "Francia"};
    Menu menu = new Menu(opcionesMenu);
    Productos[] listaProductos;

    public void crearProductos(int numeroProductos) {
        listaProductos = new Productos[numeroProductos];
        System.out.println("Creando lista de productos....");

        for (int i = 0; i < listaProductos.length; i++) {
            if (i <= 1) {
                listaProductos[i] = new Frescos("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now(), 123422 * (i + 1), LocalDate.now().minusDays(5), paises[(int) (Math.random() * 5)]);

            }
            if (i > 1 && i < 4) {
                listaProductos[i] = new Refrigerados("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now().minusDays(5), 123422 * i, "ABC-" + i);

            }
            if (i >= 4) {
                listaProductos[i] = new Congelados("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now(), 123422 * i, -5.0 * i);
            }
        }

    }

    public Productos[] getListaProductos() {

        return listaProductos;
    }

    public String mostarProductoConID(String id) {
        for (Productos listaProducto : listaProductos) {
            if (listaProducto.getId_Producto().equals(id)) {

                return listaProducto.toString();
            }
        }
        return null;
    }

    public boolean modificarTemperaturaCongelacion(String id, double temperatura) {
        boolean bandera = false;
        for (Productos listaProducto : listaProductos) {
            if (listaProducto.getId_Producto().equals(id) && listaProducto instanceof Congelados) {
                ((Congelados) listaProducto).setTemperaturaRecomendadaCong(temperatura);
                bandera = true;
            }
        }
        return bandera;
    }

    public Frescos[] productosFrescosPorPais(String pais) {
        int contadorProductos = 1;
        for (Productos listaProducto : listaProductos) {
            if ((listaProducto instanceof Frescos) && ((Frescos) listaProducto).getPaisOrigen().equalsIgnoreCase(pais)) {
                contadorProductos++;
            }
        }
        Frescos[] productosFrescos = new Frescos[contadorProductos];
        for (int i = 0; i <= productosFrescos.length; i++) {
            if ((listaProductos[i] instanceof Frescos) && ((Frescos) listaProductos[i]).getPaisOrigen().equalsIgnoreCase(pais)) {
                productosFrescos[i] = (Frescos) listaProductos[i];
            }
        }
        return productosFrescos;
    }

    public Productos[] getProductosCaducados() {
        int contadorCaducados = 0;
        for (Productos listaProducto : listaProductos) {
            if (listaProducto.getFecha_Caaducidad().isBefore(LocalDate.now())) {
                contadorCaducados++;
            }
        }
        Productos[] productosCaducados = new Productos[contadorCaducados];
        for (int i = 0; i < productosCaducados.length; i++) {
            if (listaProductos[i].getFecha_Caaducidad().isBefore(LocalDate.now())) {
                productosCaducados[i] = listaProductos[i];
            }
        }
        return productosCaducados;
    }

    public Productos[] getProductTipe(String tipo) {
        int contadorTipo = 0;
        for (Productos listaProducto : listaProductos) {
            if (listaProducto.getClass().getName().equalsIgnoreCase("productos." + tipo)) {
                contadorTipo++;
            }
        }
        Productos[] productTipe = new Productos[contadorTipo];
        for (int i = 0; i < productTipe.length; i++) {
            if (listaProductos[i].getClass().getName().equalsIgnoreCase("productos." + tipo)) {
                productTipe[i] = listaProductos[i];
            }
        }
        return productTipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gestion gestion)) return false;
        return Arrays.equals(listaProductos, gestion.listaProductos);
    }

    @Override
    public int hashCode() {
        return Objects.hash((Object) listaProductos);
    }
}




