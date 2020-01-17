package uebung3.uebung3_1;

public class Main {


    public static void main(String[] args) {

        PassengerList passengerList = new PassengerList();


        Person p1 = new Person();
        p1.setName("Person A");

        CrewMember member1 = new CrewMember();
        member1.setName("Crew Member A");

        Pilot pilot1 = new Pilot();
        pilot1.setName("Pilot A");

        passengerList.add(pilot1);
        passengerList.add(member1);
        passengerList.add(pilot1);
        passengerList.add(p1);

        //------------------------------------------------------------

        Humans[] newPassengerList = new Humans[3];

        newPassengerList[0] = p1;
        newPassengerList[1] = member1;
        newPassengerList[2] = p1;
        findDuplikates(newPassengerList);


    }

    public static void findDuplikates(Humans[] passengerList) {

        for (int i = 0; i < passengerList.length; i++) {
            for (int j = i + 1; j < passengerList.length; j++) {
                if (passengerList[i].equals(passengerList[j])) {
                    System.out.println("Dublikat gefunden!");
                }
            }
        }


    }


}
