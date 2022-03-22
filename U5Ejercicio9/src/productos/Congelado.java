package productos;

import java.time.LocalDate;

public class Congelado extends Producto {
    private double temperaturaCon;

    public Congelado(double temperaturaCon, String idProducto, String descripcion, LocalDate fechaCad, int lote) {
        super(idProducto, descripcion, fechaCad, lote);
        this.temperaturaCon = temperaturaCon;
    }

    public double getTemperaturaCon() {
        return temperaturaCon;
    }

    public void setTemperaturaCon(double temperaturaCon) {
        this.temperaturaCon = temperaturaCon;
    }

    @Override
    public String toString() {
        return super.toString() + " Congelado{" + "temperaturaCon=" + temperaturaCon + '}';
    }
}
