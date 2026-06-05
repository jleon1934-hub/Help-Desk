package factory;

public class IncidenteHardware extends Incidente {

    @Override
    public void procesar() {
        System.out.println("Procesando incidente de hardware");
    }
}