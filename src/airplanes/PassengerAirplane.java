package airplanes;

public class PassengerAirplane extends Airplane {
    public PassengerAirplane(String model, int capacity) {
        super(model, capacity);
    }

    @Override
    public void fly() {
        System.out.println("Passenger airplane " + getModel() + " is flying with capacity " + getCapacity());
    }
}
