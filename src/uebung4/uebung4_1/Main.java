package uebung4.uebung4_1;

public class Main {


    public static void main(String[] args) {

        Month month = Month.FEBRUARY;

        System.out.println(month.name() + " has " + month.getAmountOfDays()+ " days.");

        if (month.in(Season.WINTER)){
            System.out.println("This month is in Winter");
        }
    }
}
