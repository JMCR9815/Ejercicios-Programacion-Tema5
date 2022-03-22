package App;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("45578145 J", "Antonio", 924556098);
        Cliente cliente2 = new Cliente("52578145 I", "Juan", 924256918);
        CuentaBancaria cuenta1 = new CuentaBancaria(cliente1, 1500.00, "15681490-FBJ");
        CuentaBancaria cuenta2 = new CuentaBancaria(cliente2, 1500.00, "19686493-FHB");


        System.out.println("El saldo actual de la cuenta 1 es: " + cuenta1.getSaldo());
        // System.out.println("El saldo actualizado de la cuenta1 es: " + cuenta1.depositar(150.00));
        System.out.println();
        System.out.println("El saldo actual de la cuenta origen es de: " + cuenta1.getSaldo());
        System.out.println("El saldo actual de la cuenta destino es de: " + cuenta2.getSaldo());
        System.out.println();
        if (cuenta1.transferencia(150.00, cuenta2)) {
            System.out.println("El saldo actualizado de la cuenta origen es de: " + cuenta1.getSaldo());
            System.out.println("El saldo actualizado de la cuenta destino es de: " + cuenta2.getSaldo());
        } else {
            System.err.println("Error, no ha podido completarse la trnaferencia, la cantidd indicada suoera el saldo actual de la cuenta origen");
        }
    }

}
