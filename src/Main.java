import airplanes.Airplane;
import airplanes.AirplaneFactory;
import airport.Airline;
import airport.Airport;
import airport.Flight;
import airport.Gate;
import baggage.BaggageHandler;
import baggage.BaggageTransporting;
import customer.Customer;

public class Main {
    public static void main(String[] args) {

        Airport airport = new Airport("International airport.Airport");

        Airline airline1 = new Airline("RyinAir");
        Airline airline2 = new Airline("UkrZaliznycia");

        Airplane passengerPlane = AirplaneFactory.createAirplane("Passenger", "Boeing 737", 180);
        Airplane cargoPlane = AirplaneFactory.createAirplane("Cargo", "Cucurudzianyk", 50000);

        airline1.addAirplane(passengerPlane);
        airline2.addAirplane(cargoPlane);

        airport.addAirline(airline1);
        airport.addAirline(airline2);

        airport.getDisplayBoard().updateFlightInfo("Flight AA123 - On time");
        airport.getDisplayBoard().showBoard();

        Customer customerOne = new Customer.Builder()
                .withFullName("Yurii Yanovskyi")
                .withPassportNumber("A123456")
                .build();

        Customer customerTwo = new Customer.Builder()
                .withFullName("Wolodymyr Zelenskyi")
                .withPassportNumber("A123456")
                .build();

        customerOne.checkIn();
        customerTwo.checkIn();

        BaggageHandler baggageSystem = new BaggageTransporting();
        baggageSystem.processBaggage(customerOne.dropBaggage(20));
        baggageSystem.processBaggage(customerTwo.dropBaggage(30));

        Flight flight = new Flight.Builder()
                .withFlightNumber("AA123")
                .withAirplane(passengerPlane)
                .withGate(new Gate(777))
                .build();

        flight.boardFlight(customerOne);
        flight.boardFlight(customerTwo);

        flight.depart();
    }
}
