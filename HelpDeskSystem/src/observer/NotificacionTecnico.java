package observer;

public class NotificacionTecnico implements Observador {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Notificacion recibida: " + mensaje);
    }
}