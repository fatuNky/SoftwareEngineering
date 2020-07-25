package KlausurWise19_20.exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class MyList<T> extends ArrayList<Employee> {


    public HashMap<Integer, Integer> getOccurencesByValue() {
        HashMap<Integer, Integer> occurences = new LinkedHashMap<>();

        for (int i = 0; i < size(); i++) {
            int counter = 1;

            for (int j = i + 1; j < size(); j++) {

                if (occurences.containsKey(get(i).getSalary())) {
                    break;
                }

                if (get(i).getSalary().equals(get(j).getSalary())) {
                    counter++;
                }
                occurences.put(get(i).getSalary(), counter);
            }


            if (i == size() - 1) {

                if (occurences.containsKey(get(i).getSalary())) {
                    break;
                }
                occurences.put(get(i).getSalary(), counter);
            }
        }
        return occurences;
    }


}
