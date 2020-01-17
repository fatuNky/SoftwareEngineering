package uebung2.uebung2_1;

public class EmployeesTypeB implements Employees{

    private int workedHours;
    private double salaryPerHour;
    private double totalSalary;


    public int getWorkedHours() {

        return workedHours;
    }

    public void setWorkedHours(int workedHours) {

        this.workedHours = workedHours;
    }

    public double getSalaryPerHour() {

        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {

        this.salaryPerHour = salaryPerHour;
    }


    public double getTotalSalary() {

        return workedHours*salaryPerHour;
    }
}
