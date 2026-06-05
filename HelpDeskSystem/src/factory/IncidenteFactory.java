package factory;

public class IncidenteFactory {

    public static Incidente crearIncidente(String tipo) {

        return switch (tipo.toLowerCase()) {
            case "hardware" -> new IncidenteHardware();
            case "red" -> new IncidenteRed();
            case "software" -> new IncidenteSoftware();
            default -> null;
        };
    }
}