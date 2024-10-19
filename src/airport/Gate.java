package airport;

public class Gate {
    private int gateNumber;

    public Gate(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void openGate() {
        System.out.println("Gate " + gateNumber + " is now open for boarding.");
    }

    public void closeGate() {
        System.out.println("Gate " + gateNumber + " is now closed.");
    }

    public int getGateNumber() {
        return gateNumber;
    }
}
