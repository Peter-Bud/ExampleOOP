package airport;

import airplanes.Airplane;

import java.util.ArrayList;
import java.util.List;

public class Airline implements AirlineInterface {
    private String name;
    private List<Airplane> airplanes;

    public Airline(String name) {
        this.name = name;
        this.airplanes = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    public void flyAllPlanes() {
        for (Airplane airplane : airplanes) {
            airplane.fly();
        }
    }
}
