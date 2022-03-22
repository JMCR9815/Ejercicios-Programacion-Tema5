package App;

import java.time.LocalDate;


public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaAlquiler;
    private int numDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler, int numDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
        this.numDiasAlquiler = numDiasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getNumDiasAlquiler() {
        return numDiasAlquiler;
    }

    public void setNumDiasAlquiler(int numDiasAlquiler) {
        this.numDiasAlquiler = numDiasAlquiler;
    }

    public int getImporteTotal() {
        return this.numDiasAlquiler * (int) vehiculo.getTarifa();
    }
}
