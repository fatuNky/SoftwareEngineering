package KlausurSoSe19;

public class exercise4 {
    public static void main(String[] args) {

        Runnable runnable2 = () -> {
            for (int i = 0; i < 200; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable2);

    }
}