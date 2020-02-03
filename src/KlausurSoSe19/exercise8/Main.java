package KlausurSoSe19.exercise8;

public class Main {


    //Just for testing
    public static void main(String[] args) {
        Employee e1 = new Employee("e1", 1000);
        Employee e2 = new Employee("e2", 6000);
        Employee e3 = new Employee("e3", 100);
        Employee e4 = new Employee("e4", 2000);

        MyList<Employee> employees = new MyList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Employee e = employees.getSmallestElement();
        System.out.println(e.getSalary());
    }
}
