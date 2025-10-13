package multiThreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        // task class object
        // create the thread using the task class
        // start the thread

        ExecutorService executor = Executors.newScheduledThreadPool(10);
//        long startTime = System.currentTimeMillis();
        for(int i=1;i<=50; i++){
            if(i==5 || i==11 | i== 20){
                Thread.sleep(1000);
                System.out.println("Debug");
            }
            CubePrinter cubePrinter = new CubePrinter(i);
            executor.execute(cubePrinter);
        }
        System.out.println("Debug");

        executor.shutdown();
//        long endTime = System.currentTimeMillis();
    }
}
