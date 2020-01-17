package uebung2.uebung2_5;

public class Main {


    public static void main(String[] args) {
        Person a = new Person();
        a.setName("A");
        a.canSeeFlightDetails();

        CrewMember b = new CrewMember();
        b.setName("B");
        b.canSeeFlightDetails();
        b.canSeePassengerList();


        Pilot c = new Pilot();
        c.setName("C");
        c.canSeeFlightDetails();
        c.canSeePassengerList();
        c.canCancelFlight();





    }






}
