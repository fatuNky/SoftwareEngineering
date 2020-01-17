package threads;

public class ThreadExample extends Thread {

    ThreadExample(String name){
        setName(name);
    }

    @Override
    public void run() {
        System.out.println("Inside: " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


}
