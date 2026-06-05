package observer;

public interface Subject {

    void agregarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificar(String mensaje);
}