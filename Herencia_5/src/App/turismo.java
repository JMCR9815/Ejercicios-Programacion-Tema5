package App;

public class turismo extends Vehiculo {
    private int puertas;
    private boolean automatico;

    public turismo(String matricula, String marca, String modelo, double tarifa, boolean disponible, int puertas, boolean automatico) {
        super(matricula, marca, modelo, tarifa, disponible);
        this.puertas = puertas;
        this.automatico = automatico;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return "Vehiculo: Turismo{" + super.toString() + "puertas=" + puertas + ", automatico=" + automatico + '}';
    }
}
