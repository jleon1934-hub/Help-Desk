package model;

public class Ticket {

    private final int id;
    private final String descripcion;
    private final String estado;

    public Ticket(int id, String descripcion, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public void mostrarTicket() {
        System.out.println(id + " " + descripcion + " " + estado);
    }
}