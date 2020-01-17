package uebung4.uebung4_3;

public class Main {

    public static void main(String[] args) {

        Currency dollar = Currency.DOLLAR;
        dollar.setConverstionFactor(0.89);

        Currency pound = Currency.POUND;
        pound.setConverstionFactor(1.16);

        Currency chf = Currency.SWISSFRANCS;
        chf.setConverstionFactor(0.88);


        Cost cost = new Cost(5, Currency.POUND);
        double amountInCurrency = cost.getAmountInCurrency(Currency.EURO);

        System.out.println(amountInCurrency);



    }
}
