package uebung3.uebung3_1;

import java.util.ArrayList;
import java.util.List;

public class PassengerList {

    List<Humans> passengerList = new ArrayList<>();

    public void add(Humans human) {

        if (passengerList.contains(human)) {
            System.out.println("Duplikat gefunden ");
        }

        passengerList.add(human);
    }

}
