package uebung7.uebung7_6bis9;

import java.util.Comparator;

public class AgeComparator implements Comparator<Passenger> {

    @Override
    public int compare(Passenger o1, Passenger o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
