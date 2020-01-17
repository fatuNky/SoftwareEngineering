package uebung10.uebung10_3;

import Klausur.exercise4.Student;
import org.junit.Test;
import uebung3.uebung3_1.Person;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {

    static List<Human> passengerList = new LinkedList<>();
    Pilot pilot = new Pilot("Paul", 45);
    CrewMember crewMemb = new CrewMember("Manfred", 23);
    Passenger passenger = new Passenger("Pia", 18);
    Person p = new Person();


    @Test(expected = NoAuthorityException.class)
    public void testPrintPassengerList_Passenger() throws NoAuthorityException {

        passengerList.add(passenger);

        Main authorityCheck = new Main();

        authorityCheck.printPassengerList(passenger, passengerList);

    }

    @Test
    public void testPrintPassengerList_CrewMemb() throws NoAuthorityException {
        passengerList.add(pilot);
        passengerList.add(crewMemb);
        passengerList.add(pilot);

        Main authorityCheck = new Main();
        List<String> aPassengerList = new LinkedList<>();

        for (int i = 0; i < passengerList.size(); i++) {
            aPassengerList.add(passengerList.get(i).getName());
        }

        List<String> anotherPassengerList = authorityCheck.printPassengerList(crewMemb, passengerList);

        assertEquals(aPassengerList, anotherPassengerList);
    }

    @Test
    public void testPrintPassengerList_Pilot() throws NoAuthorityException {

        passengerList.add(pilot);
        passengerList.add(crewMemb);
        passengerList.add(pilot);

        Main authorityCheck = new Main();
        List<String> aPassengerList = new LinkedList<>();

        for (int i = 0; i < passengerList.size(); i++) {
            aPassengerList.add(passengerList.get(i).toString());
        }

        List<String> anotherPassengerList = authorityCheck.printPassengerList(pilot, passengerList);

        assertEquals(aPassengerList, anotherPassengerList);
    }


}