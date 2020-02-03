package KlausurSoSe19.exercise8;


//Just for testing
public class Employee implements Comparable<Employee> {

    private String name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        return salary.compareTo(o.getSalary());
    }
}
