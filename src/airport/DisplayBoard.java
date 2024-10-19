package airport;

import java.util.ArrayList;
import java.util.List;

public class DisplayBoard {
    private List<String> flightInfo = new ArrayList<>();

    public void updateFlightInfo(String info) {
        flightInfo.add(info);
        System.out.println("Updated display board: " + info);
    }

    public void showBoard() {
        System.out.println("Current flights:");
        for (String info : flightInfo) {
            System.out.println(info);
        }
    }
}
