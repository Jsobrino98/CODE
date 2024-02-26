package com_acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        System.out.println("Esta instruccion es invisible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
