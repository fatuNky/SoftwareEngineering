package uebung10.uebung10_3;


import java.util.LinkedList;
import java.util.List;

public class Main {

    static List<Human> passengerList = new LinkedList<Human>();

    public static void main(String[] args) {

        Pilot pilot = new Pilot("Pilot", 45);
        CrewMember crewMemb = new CrewMember("Member", 23);
        Passenger passenger = new Passenger("Passenger", 18);

        passengerList.add(pilot);
        passengerList.add(crewMemb);
        passengerList.add(passenger);

        try {
            System.out.println(printPassengerList(passenger,passengerList));
        } catch (NoAuthorityException e) {
            System.out.println("You have no authority to view the passenger list!");
        }

        System.out.println("-----------------");

        try {
            System.out.println(printPassengerList(crewMemb,passengerList));
        } catch (NoAuthorityException e) {
            System.out.println("You have no authority to view the passenger list!");
        }

        System.out.println("-----------------");

        try {
            System.out.println(printPassengerList(pilot,passengerList));
        } catch (NoAuthorityException e) {
            System.out.println("You have no authority to view the passenger list!");
        }

    }

    public static List<String> printPassengerList(Human human, List<Human> list) throws NoAuthorityException {

        List<String> aPassengerList = new LinkedList<>();

        if (human instanceof Pilot) {
            for (int i = 0; i < list.size(); i++) {
                aPassengerList.add(list.get(i).toString());
            }
        } else if (human instanceof CrewMember) {

            for (int i = 0; i < list.size(); i++) {
                aPassengerList.add(list.get(i).getName());
            }
        } else {
            throw new NoAuthorityException("You have no authority to view the passengerlist!");
        }

        return aPassengerList;
    }

}
