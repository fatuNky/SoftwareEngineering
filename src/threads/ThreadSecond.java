package threads;

public class ThreadSecond extends Thread{

    ThreadSecond(String name){
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
