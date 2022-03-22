package Productos;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {
    private int codigoOrgSupervisionAlimentaria;

    public ProductosRefrigerados(int id_Producto, String descripcion, LocalDate fecha_Caaducidad, int numLote, int codigoOrgSupervisionAlimentaria) {
        super(id_Producto, descripcion, fecha_Caaducidad, numLote);
        this.codigoOrgSupervisionAlimentaria = codigoOrgSupervisionAlimentaria;
    }

    public int getCodigoOrgSupervisionAlimentaria() {
        return codigoOrgSupervisionAlimentaria;
    }

    public void setCodigoOrgSupervisionAlimentaria(int codigoOrgSupervisionAlimentaria) {
        this.codigoOrgSupervisionAlimentaria = codigoOrgSupervisionAlimentaria;
    }

    @Override
    public String toString() {
        return "Producto: Refrigerado => " + super.toString() + "Codigo del organismo de supervisión alimentaria: " + codigoOrgSupervisionAlimentaria + " .";
    }
}
