package KlausurWise19_20.exercise9;

public class Employee {
    private String name;
    private int salary;
    private Position position;
    private CompanyCar companyCar;

    public Employee(String name, int salary, Position position, CompanyCar companyCar) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.companyCar = companyCar;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyCar getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(CompanyCar companyCar) {
        this.companyCar = companyCar;
    }

    static enum Position {
        MANAGER, WORKER
    }
    static class CompanyCar{
        private String brand;
        private String model;
        private int costPerMonth;

        public CompanyCar(String brand, String model, int costPerMonth) {
            this.brand = brand;
            this.model = model;
            this.costPerMonth = costPerMonth;
        }

        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getCostPerMonth() {
            return costPerMonth;
        }
        public void setCostPerMonth(int costPerMonth) {
            this.costPerMonth = costPerMonth;
        }


        @Override
        public String toString() {
            return "CompanyCar{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", costPerMonth=" + costPerMonth +
                    '}';
        }
    }
}

