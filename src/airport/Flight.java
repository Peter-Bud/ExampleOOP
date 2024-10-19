package airport;

import airplanes.Airplane;
import customer.Customer;

public class Flight {
    private String flightNumber;
    private Airplane airplane;
    private Gate gate;

    private Flight(Builder builder) {
        this.flightNumber = builder.flightNumber;
        this.airplane = builder.airplane;
        this.gate = builder.gate;
    }

    public void boardFlight(Customer customer) {
        System.out.println(customer.getFullName() + " is boarding flight " + flightNumber + " at gate " + gate.getGateNumber());
    }

    public void depart() {
        gate.openGate();
        System.out.println("Flight " + flightNumber + " is departing with airplane " + airplane.getModel());
        gate.closeGate();
    }

    public static class Builder {
        private String flightNumber;
        private Airplane airplane;
        private Gate gate;

        public Builder withFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder withAirplane(Airplane airplane) {
            this.airplane = airplane;
            return this;
        }

        public Builder withGate(Gate gate) {
            this.gate = gate;
            return this;
        }

        public Flight build() {
            return new Flight(this);
        }
    }
}
