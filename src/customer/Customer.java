package customer;

import baggage.Baggage;

public class Customer {
    private String fullName;
    private String passportNumber;

    private Customer(Builder builder) {
        this.fullName = builder.fullName;
        this.passportNumber = builder.passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public static class Builder {
        private String fullName;
        private String passportNumber;

        public Builder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder withPassportNumber(String passportNumber) {
            this.passportNumber = passportNumber;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public void checkIn() {
        System.out.println(fullName + " with passport " + passportNumber + " has checked in");
    }

    public Baggage dropBaggage(int weight) {
        System.out.println(fullName + " dropped baggage of " + weight + " kg.");
        return new Baggage(fullName, weight);
    }
}

