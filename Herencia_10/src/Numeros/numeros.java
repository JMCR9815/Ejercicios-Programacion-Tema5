package Numeros;

public class numeros {
    private int numeros;

    public numeros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "" + numeros;
    }
}
