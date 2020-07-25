package uebung7.uebung7_6bis9;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Passenger p1 = new Passenger("x", 20);
        Passenger p2 = new Passenger("y", 28);
        Passenger p3 = new Passenger("z", 15);

        List<Passenger> collection = new LinkedList<>();

        collection.add(p2);
        collection.add(p1);
        collection.add(p3);


        //exercise 7_6
        for (Passenger passenger : collection) {
            System.out.println(passenger.toString());
        }


        System.out.println("-------------------------\n");

        //exercise 7_7

        TreeSet<Passenger> passengerList = new TreeSet<>(new AlphabeticalComparator());

        passengerList.add(p3);
        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);

        for (Passenger passenger : passengerList) {
            System.out.println(passenger.toString());
        }


        System.out.println("-------------------------\n");

        //exercise 7_8


        TreeSet<Passenger> passengerListAge = new TreeSet<>(new AgeComparator());


        passengerListAge.add(p3);
        passengerListAge.add(p1);
        passengerListAge.add(p2);
        passengerListAge.add(p3);

        for (Passenger passenger : passengerListAge) {
            System.out.println(passenger.toString());
        }


        System.out.println("-------------------------\n");


        //exercise 7_9

        Map<Passenger, Boolean> hasEnteredPlane = new HashMap<>();

        hasEnteredPlane.put(p1, true);
        hasEnteredPlane.put(p3, false);
        hasEnteredPlane.put(p2, true);
        hasEnteredPlane.put(p3, true);

        for (Map.Entry<Passenger, Boolean> entries : hasEnteredPlane.entrySet()) {
            System.out.println(entries.getKey() + " has entered Plane: " + entries.getValue());
        }
    }
}
