package uebung8.uebung8_1;

public class Main {


    public static void main(String[] args) {


        String[] strings = {"a", "b", "c"};
        changePosition(strings, 1, 2);


        for (String string:strings) {
            System.out.println(string);
        }

        Integer[] ints = {1, 2, 3};

        changePosition(ints, 1, 2);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(ints[i]);
        }
    }


    public static <T> void changePosition(T[] array, int one, int two) {
        T value = array[one];
        array[one] = array[two];
        array[two] = value;
    }





}

