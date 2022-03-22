package App;

public class Fragoneta extends Vehiculo {
    private int capacidadLitros, cargaMaxima;

    public Fragoneta(String matricula, String marca, String modelo, double tarifa, boolean disponible, int capacidadLitros, int cargaMaxima) {
        super(matricula, marca, modelo, tarifa, disponible);
        this.capacidadLitros = capacidadLitros;
        this.cargaMaxima = cargaMaxima;

    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo: Fragoneta{" + super.toString() + "capacidadLitros=" + capacidadLitros + ", cargaMaxima=" + cargaMaxima + '}';
    }
}
