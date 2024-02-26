package com_acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitarDatos(String mensaje) {
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public void saludar(Persona p) {
        System.out.println("Hola %s, benvido a Java \n" + p);
    }
}
