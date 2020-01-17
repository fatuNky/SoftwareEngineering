package threads;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside: " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
