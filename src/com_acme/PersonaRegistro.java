package com_acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        return "%s %s".formatted(nombre, apellidos);
    }
}