package Java_Basics.Threads;

public class HelloWorldPrinter implements Runnable{
    public void run() {
        System.out.println("Hello World from "+ Thread.currentThread().getName());
    }
}