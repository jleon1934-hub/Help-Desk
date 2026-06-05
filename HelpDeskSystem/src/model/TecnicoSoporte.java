package model;

public class TecnicoSoporte {

    private final String nombre;
    private final String especialidad;

    public TecnicoSoporte(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void atenderTicket() {
        System.out.println(nombre + " atendiendo incidente");
    }
}