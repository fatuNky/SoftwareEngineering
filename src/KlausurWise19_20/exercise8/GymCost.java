package KlausurWise19_20.exercise8;

public class GymCost {

    private Discount discount;
    private GymProgram gymProgram;

    public double getCosts(GymProgram gymProgram, Discount discount){
        return gymProgram.cost * discount.discount;
    }

    public static void main(String[] args) {
        GymCost gymCosts = new GymCost();
        double costs = gymCosts.getCosts(GymProgram.Basic, Discount.Student);
        System.out.println(costs);
    }

    static enum Discount{
        Student(0.5), No(1), Retiree(0.5);

        private double discount;

        Discount(double discount){
            this.discount = discount;
        }
    }

    static enum GymProgram{
        Basic(20), Sauna(50), PersonalTrainer(80);

        private int cost;

        GymProgram(int cost){
            this.cost = cost;
        }
    }
}
