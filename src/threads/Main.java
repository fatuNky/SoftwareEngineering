package threads;

public class Main {


    public static void main(String[] args) {

        /*
        Topics -> Following 5 Thread examples:

        Creating two Thread classes and start without runnable

        Creating a Class wich implements Runnable, create Runnable in main and execute Thread with it

        Create Runnable within main through anonymous class

        Create Runnable with lambda expression

         */
        System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Creating Thread 1");

        Thread thread1 = new ThreadExample("First Thread");

        System.out.println("Creating Thread 2");

        Thread thread2 = new ThreadSecond("Second Thread");

        System.out.println("Starting Thread 1");

        thread1.start();

        System.out.println("Starting Thread 2");
        thread2.start();

        Runnable runnable = new RunnableExample();

        Thread thread3 = new Thread(runnable);

        thread3.setName("Thread with Runnable");

        thread3.start();


        //Runnable with anonymous class

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside: " + Thread.currentThread().getName());

                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }; // <- Note the semicolon after end of anonymous class!

        Thread thread4 = new Thread(runnable1);

        thread4.setName("Runnable example with anonymous class");
        thread4.start();


        //Example of Runnable with lambda expression

        Runnable runnable2 = () -> {
            System.out.println("Inside: " + Thread.currentThread().getName());

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }

        }; // <- Note the semicolon!


        Thread thread5 = new Thread(runnable2);
        thread5.setName("Runnable with lambda");
        thread5.start();


        /*
        Good to know:

        Runnable or Thread, Which one to use?
        The first method, where you create a thread by extending from Thread class is very limited because once you
        extend your class from Thread, you cannot extend from any other class since Java doesn’t allow multiple inheritance.

        Also, If you follow good design practice, Inheritance is meant for extending the functionality of the parent class,
        but when you create a thread, you don’t extend the functionality of Thread class, you merely provide the implementation
        of run() method.

        So, In general, You should always use Runnable object to create a thread. This method is more flexible.
        It allows your class to extend from any other class. Also, you can use anonymous class syntax and Java 8’s
        lambda expression with Runnable to make your code more concise.
         */
    }
}
