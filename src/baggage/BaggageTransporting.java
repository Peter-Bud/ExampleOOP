package baggage;

public class BaggageTransporting implements BaggageHandler {
    @Override
    public void processBaggage(Baggage baggage) {
        System.out.println("Processing baggage for " + baggage.getOwnerName() + " with weight " + baggage.getWeight() + " kg");
    }
}
