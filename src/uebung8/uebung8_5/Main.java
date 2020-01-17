package uebung8.uebung8_5;

import uebung10.uebung10_1.LList;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2);
        System.out.println(ints.size());

        Integer last = getLast(ints);
        System.out.println(last);

    }

    public static <T> T getLast(List<T> list) {

        return list != null && !list.isEmpty() ? list.get(list.size() -1) : null;
    }


}