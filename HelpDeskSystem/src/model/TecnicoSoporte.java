package model;

public class TecnicoSoporte {

    private final String nombre;

    public TecnicoSoporte(String nombre, String especialidad) {
        this.nombre = nombre;
    }

    public void atenderTicket() {
        System.out.println(nombre + " atendiendo incidente");
    }
}