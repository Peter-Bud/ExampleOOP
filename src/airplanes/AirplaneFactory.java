package airplanes;


public class AirplaneFactory {
    public static Airplane createAirplane(String type, String model, int capacity) {
        switch (type) {
            case "Passenger":
                return new PassengerAirplane(model, capacity);
            case "Cargo":
                return new CargoAirplane(model, capacity);
            default:
                throw new IllegalArgumentException("Unknown airplane");
        }
    }
}
