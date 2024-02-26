package com_acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //Comento la linea de codigo que considero que se puede eliminar
        //System.out.println("Esta instruccion es invisible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
