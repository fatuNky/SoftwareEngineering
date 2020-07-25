package Probeklausur.exercise6and7;

import uebung7.uebung7_6bis9.Passenger;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //to see implementation go to interface
        TriConsumer<String, String, String> printThreeStringsConsumer = (x, y, z) -> System.out.println(x + " " + y + " " + z);

        //exercise 6.3
        printThreeStringsConsumer.accept("Ja", "es", "klappt!");

        //exercise 6.4

        BiFunction<Integer, Integer, Integer> sumNumb = (x, y) -> x+y;

        System.out.println(sumNumb.apply(4,96));

        Supplier<String> someText = () -> "This is a dummy";

        System.out.println(someText.get());



        //exercise 7

        Integer [] numbers = {5,12,11,7};

        Arrays.sort(numbers, (a, b) -> a - b);


        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        TriFunction<Integer, Integer, Integer> sum = (x, y, z) -> x+y+z;


        System.out.println(sum.apply(5,4,2));















    }
}
