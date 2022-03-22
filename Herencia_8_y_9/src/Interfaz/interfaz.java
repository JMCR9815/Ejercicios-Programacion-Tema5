package Interfaz;

import Persona.Persona;

public interface interfaz {
    boolean estaVacia();

    Persona primero();


    Persona extraer();


    boolean insertar(String id, String nombre);

    void mostrar();

}
