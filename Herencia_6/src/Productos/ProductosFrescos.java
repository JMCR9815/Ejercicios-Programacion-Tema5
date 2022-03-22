package Productos;

import java.time.LocalDate;

public class ProductosFrescos extends Productos {
    private LocalDate fecha_Envasado;
    private String paisOrigen;

    public ProductosFrescos(int id_Producto, String descripcion, LocalDate fecha_Caaducidad, int numLote, LocalDate fecha_Envasado, String paisOrigen) {
        super(id_Producto, descripcion, fecha_Caaducidad, numLote);
        this.fecha_Envasado = fecha_Envasado;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFecha_Envasado() {
        return fecha_Envasado;
    }

    public void setFecha_Envasado(LocalDate fecha_Envasado) {
        this.fecha_Envasado = fecha_Envasado;
    }

    public String getDescripcion() {
        return paisOrigen;
    }

    public void setDescripcion(String descripcion) {
        this.paisOrigen = descripcion;
    }

    @Override
    public String toString() {
        return "Productos: Frescos => " + super.toString() + "Fecha de envasado: " + fecha_Envasado + ", Pais de origen: '" + paisOrigen + '\'' + " .";
    }
}
