package airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private List<Airline> airlines = new ArrayList<>();
    private DisplayBoard displayBoard = new DisplayBoard();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public void evacuationFlights() {
        for (Airline airline : airlines) {
            airline.flyAllPlanes();
        }
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }
}
