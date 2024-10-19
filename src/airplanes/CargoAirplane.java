package airplanes;

public class CargoAirplane extends Airplane {
    public CargoAirplane(String model, int capacity) {
        super(model, capacity);
    }

    @Override
    public void fly() {
        System.out.println("Cargo airplane " + getModel() + " is flying with capacity " + getCapacity());
    }
}
