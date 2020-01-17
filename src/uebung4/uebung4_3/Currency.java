package uebung4.uebung4_3;

public enum Currency {
    DOLLAR, EURO, POUND, SWISSFRANCS;

    private double converstionFactor;



    public double getConverstionFactor() {
        return converstionFactor;
    }

    public void setConverstionFactor(double converstionFactor) {
        this.converstionFactor = converstionFactor;
    }
}
