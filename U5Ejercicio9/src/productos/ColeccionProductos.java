package productos;

import java.time.LocalDate;

public class ColeccionProductos {
    Producto[] listaP;

    public ColeccionProductos(int numeroProductos) {
        listaP = new Producto[numeroProductos];

        for (int i = 0; i < listaP.length; i++) {
            String id = "00000" + i;
            String descripcion = "Producto-" + i;
            LocalDate fechaC = LocalDate.of(2020, 3, 3);
            int lote = 123422 * i;
            int tipo = (int) (Math.random() * 3);
            switch (tipo) {
                case 0:
                    //Congelado
                    double tempC = -5.0 * i;
                    listaP[i] = new Congelado(tempC, id, descripcion, fechaC, lote);
                    break;
                case 1:
                    //Refrigerado
                    String codigo = "ABC-" + i;
                    listaP[i] = new Refrigerado(codigo, id, descripcion, fechaC, lote);
                    break;
                case 2:
                    //Fresco
                    LocalDate fechaE = LocalDate.now();
                    fechaE.minusDays(5);
                    String[] paises = {"Espa�a", "Italia", "Marruecos", "Argelia", "Francia"};
                    String paisO = paises[(int) (Math.random() * 5)];
                    listaP[i] = new Fresco(fechaE, paisO, id, descripcion, fechaC, lote);

            }
        }
        //Hago caducar el primer producto
        listaP[0].setFechaCad(LocalDate.now().minusDays(5));
    }

    //retornar array de productos
    public Producto[] getProductos() {

    }


    //modificar T� de congelacion de un producto buscando por su id
    public boolean modificarTemperaturaCongelacion(String id, double temp) {

    }

    //modificar T� de congelacion de un producto buscando por su id
    public boolean modificarTemperaturaCongelacion2(String id, double temp) {

    }


    //retornar array de frescos de un pa�s concreto
    public Fresco[] consultarProductosPorPaisOrigen(String paisBuscado) {

    }

    //retornar array de productos caducados 
    public Producto[] consultarProductosCaducados() {

    }

    //retornar array de productos caducados
    public Producto[] consultarProductosCaducados2() {

    }


    //obtener array de productos de un tipo
    public Producto[] obtenerProductosDelTipo(String tipo) {

    }
}
