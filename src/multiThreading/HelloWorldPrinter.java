package multiThreading;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World is running from the main thread");
    }
}
