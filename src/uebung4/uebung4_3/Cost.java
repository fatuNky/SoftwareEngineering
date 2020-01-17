package uebung4.uebung4_3;

public class Cost {


    private double amount;
    private Currency currency;

    public Cost(double amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }


    public Currency getCurrency() {
        return currency;
    }


    public double getAmountInCurrency(Currency currency){
        return this.currency.getConverstionFactor()*amount;
    }


}
