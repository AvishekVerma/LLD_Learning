package multiThreading.executors;

public class CubePrinter implements Runnable {

    int x;

    public CubePrinter(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Thread name : " +
                Thread.currentThread().getName() + ". Cube of number :" + x +
                " is = "+ (x*x*x));
    }
}
