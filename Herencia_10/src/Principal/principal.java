package Principal;

import Gestion.gestionNumeros;

import java.util.Arrays;

public class principal {

    public static void main(String[] args) {
        Gestion.gestionNumeros gestion = new gestionNumeros();
        gestion.llenarArrayNumeros();
        //Ejecucion del "metodo Mostrar numeros..."
        System.out.println("Mostrando numeros del Array...");
        gestion.mostarNumeros();
        System.out.println();
        //Ejecucion del metodo "Mostrar en String...."
        System.out.println("Mostrando numeros en formato String...");
        gestion.mostarNumerosString();
        System.out.println();
        //Ejecucion del metodo "Multiplicar Por...."
        System.out.println("mostrando Array sin modificar...");
        gestion.mostarNumerosString();
        System.out.println("Mostrando Array modificado...");
        gestion.multipicarPor(3);
        System.out.println();
        //Ejecucion del metodo "contarValoresMayoresQue...."
        int numero = 120;
        System.out.println("La cantidad de nunmeros mayores al valor introducido es: " + gestion.contarValoresMayoresQue(numero));
        System.out.println();
        //Ejecucion del metodo "contarValoresEntre...."
        int numero1 = 50;
        int numero2 = 99;
        System.out.println("La cantidad de nunmeros comprendidos entre los valores introducidos es: " + gestion.contarValoresEntre(numero1, numero2));
        System.out.println();
        //Ejecucion del metodo "compararCon...."
        int[] arrayNumeros = gestion.llenarArray();
        System.out.println("El segundo array es: " + Arrays.toString(arrayNumeros));
        System.out.println(" la suma de los valores del array con mayor número de elementos es: " + gestion.compararCon(arrayNumeros));
        System.out.println();
        //Ejecucion del metodo "getArray....."
        System.out.println("El array con mas elementos es: " + Arrays.toString(gestion.getArray(arrayNumeros)));

    }
}
