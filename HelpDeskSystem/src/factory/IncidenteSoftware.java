package factory;

public class IncidenteSoftware extends Incidente {

    @Override
    public void procesar() {
        System.out.println("Procesando incidente de software");
    }
}