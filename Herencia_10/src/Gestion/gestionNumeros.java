package Gestion;

import Interfaz.interfazGestionNumeros;
import Numeros.numeros;

import java.util.Arrays;
import java.util.Random;

public class gestionNumeros implements interfazGestionNumeros {
    numeros[] numeros = new numeros[10];

    public void llenarArrayNumeros() {
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new numeros(rnd.nextInt(0, 100));
        }
    }

    public int[] llenarArray() {
        int[] arrayNumeros = new int[numeros.length - 1];
        Random rnd = new Random();
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = rnd.nextInt(0, 100);
        }
        return arrayNumeros;
    }


    @Override
    public void mostarNumeros() {
        for (Numeros.numeros numero : numeros) {
            System.out.println(numero.getNumeros());
        }
    }

    @Override
    public void mostarNumerosString() {
        System.out.println("Array de numeros: " + Arrays.toString(numeros));

    }

    @Override
    public void multipicarPor(int numero) {
        int resultado;
        for (Numeros.numeros value : numeros) {
            resultado = value.getNumeros() * numero;
            value.setNumeros(resultado);
        }
        System.out.println("Array de numeros multiplicados: " + Arrays.toString(numeros));
    }

    @Override
    public int contarValoresMayoresQue(int numero) {
        int contadorValores = 0;
        for (Numeros.numeros value : numeros) {
            if (value.getNumeros() > numero) {
                contadorValores++;
            }
        }


        return contadorValores;
    }

    @Override
    public int contarValoresEntre(int numero1, int numero2) {
        int contadorValores = 0;
        for (Numeros.numeros numero : numeros) {
            if (numero.getNumeros() >= numero1 && numero.getNumeros() <= numero2) contadorValores++;
        }

        return contadorValores;
    }

    @Override
    public int compararCon(int[] numerosArray2) {
        int sumaValores = 0;
        if (numeros.length > numerosArray2.length) {
            for (Numeros.numeros numero : numeros) {
                sumaValores = sumaValores + numero.getNumeros();
            }
        } else {
            for (int j : numerosArray2) {
                sumaValores = sumaValores + j;
            }
        }

        return sumaValores;
    }

    @Override
    public int[] getArray(int[] arrayNumeros2) {
        int[] numerosToInt = new int[numeros.length];
        if (numeros.length > arrayNumeros2.length) {
            for (int i = 0; i < numeros.length; i++) {
                numerosToInt[i] = numeros[i].getNumeros();
            }
            return numerosToInt;
        } else return arrayNumeros2;
    }
}
