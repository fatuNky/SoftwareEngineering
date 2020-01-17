package uebung2.uebung2_1;

public class EmployeesTypeA implements Employees {

    private double fixedSalary;

    public void setSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getTotalSalary() {
        return fixedSalary;
    }

}
