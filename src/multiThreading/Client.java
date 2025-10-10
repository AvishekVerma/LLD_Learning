package multiThreading;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
//        Thread.sleep(6000);
        System.out.println("Hello World form main method");
    }
}
