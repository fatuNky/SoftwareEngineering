package KlausurSoSe19.exercise3;

public class Main {
    public static void main(String[] args) {

        Command sayHelloCommand = () -> System.out.println("Hello");
        sayHelloCommand.doSomething();
        Command anotherCommans = () -> System.out.println("Say something else");
        anotherCommans.doSomething();
    }
}
