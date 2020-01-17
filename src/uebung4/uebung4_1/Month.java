package uebung4.uebung4_1;

public enum Month {
    JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER);

    private String name;
    private int amountOfDays;
    private Season season;

    Month(int days, Season season) {
        this.amountOfDays = days;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public Season getSeason() {
        return season;
    }

    public boolean in(Season season){
        return this.season == season;
    }
}


