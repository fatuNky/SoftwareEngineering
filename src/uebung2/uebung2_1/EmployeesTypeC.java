package uebung2.uebung2_1;

public class EmployeesTypeC implements Employees{

    private double fixedSalary;
    private double bonus;
    private double totalSalary;


    public double getFixedSalary() {

        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {

        this.fixedSalary = fixedSalary;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    @Override
    public double getTotalSalary() {
        return fixedSalary+bonus;
    }
}
