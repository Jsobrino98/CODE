package com_acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String apelidos = msg.solicitarDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apelidos);
        msg.saludar(p1);
    }
}
