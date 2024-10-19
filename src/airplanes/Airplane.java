package airplanes;


public abstract class Airplane {
    private String model;
    private int capacity;

    public Airplane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract void fly(); // Abstract method to be implemented by subclasses
}
