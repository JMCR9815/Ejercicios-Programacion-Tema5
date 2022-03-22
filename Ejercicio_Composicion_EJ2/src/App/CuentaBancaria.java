package App;

public class CuentaBancaria {
    private Cliente cliente;
    private double saldo;
    private String numCuenta;

    public CuentaBancaria(Cliente cliente, double saldo, String numCuenta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cliente=" + cliente + ", saldo=" + saldo + ", numCuenta='" + numCuenta + '\'' + '}';
    }


    public double depositar(double cantidad) {
        setSaldo(getSaldo() + cantidad);
        return getSaldo();
    }

    public boolean transferencia(double cantidad, CuentaBancaria cuenta) {
        boolean vandera = false;
        double resultadoTransferencia = 0;
        if (cantidad <= this.saldo) {
            saldo = this.saldo - cantidad;
            resultadoTransferencia = cuenta.getSaldo() + cantidad;
            cuenta.setSaldo(resultadoTransferencia);
            vandera = true;
        }

        return vandera;
    }


}
