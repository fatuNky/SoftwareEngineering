package KlausurWise19_20.exercise5;

public class Main {

    public static void main(String[] args) {

        MyList<Employee> myLoyalEmployees = new MyList<>();

        //myLoyalEmployees.add(new Employee(35000, "this")); -> 2x
        //myLoyalEmployees.add(new Employee(3700, "exercise")); -> 1x
        myLoyalEmployees.add(new Employee(35000, "this"));
        myLoyalEmployees.add(new Employee(5000, "really"));
        myLoyalEmployees.add(new Employee(450, "annoys"));

        System.out.println(myLoyalEmployees.getOccurencesByValue());

        int size = myLoyalEmployees.size();

    }
}
