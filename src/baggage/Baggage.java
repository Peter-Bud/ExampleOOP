package baggage;

public class Baggage {
    private String ownerName;
    private int weight;

    public Baggage(String ownerName, int weight) {
        this.ownerName = ownerName;
        this.weight = weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getWeight() {
        return weight;
    }
}
