package uebung7.uebung7_6bis9;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Passenger> {

    @Override
    public int compare(Passenger o1, Passenger o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
