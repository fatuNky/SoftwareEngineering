package uebung2.uebung2_1;

public class Main {

    public static void main(String[] args) {

        Employees [] employees = new Employees[3];


        EmployeesTypeA e1 = new EmployeesTypeA();
        EmployeesTypeB e2 = new EmployeesTypeB();
        EmployeesTypeC e3 = new EmployeesTypeC();

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;

        e1.setSalary(5000);
        System.out.println("Salary of employee Type A: " + e1.getTotalSalary() + " €");

        e2.setWorkedHours(160);
        e2.setSalaryPerHour(30);
        System.out.println("Salary of employee Type B: " + e2.getTotalSalary() + " €");

        e3.setFixedSalary(5000);
        e3.setBonus(2000);
        System.out.println("Salary of employee Type C: " + e3.getTotalSalary() + " €");

        double totalWages = 0;

        for (Employees employee: employees) {
            totalWages += employee.getTotalSalary();
        }

        System.out.println("\nTotal amount of salaries to pay: " + totalWages + " €");




    }


}
