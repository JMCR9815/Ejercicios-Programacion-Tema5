package App;

public class Vehiculo {
    private String matricula, marca, modelo;
    private double tarifa;
    private boolean disponibilidad;

    public Vehiculo(String matricula, String marca, String modelo, double tarifa, boolean disponibilidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.disponibilidad = disponibilidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tarifa=" + tarifa +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
