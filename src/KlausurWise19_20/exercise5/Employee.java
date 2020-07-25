package KlausurWise19_20.exercise5;

public class Employee {
    private final Integer salary;
    private final String name;

    public Employee(Integer salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
