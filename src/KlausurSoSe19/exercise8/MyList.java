package KlausurSoSe19.exercise8;

import java.util.LinkedList;

public class MyList<T extends Comparable<T>> extends LinkedList<T>{

    public T getSmallestElement() {

        T smallestElement = (T) get(0);

        for (T t : this) {
            if (t.compareTo(smallestElement) < 0) smallestElement = t;
        }
        return smallestElement;
    }

}


