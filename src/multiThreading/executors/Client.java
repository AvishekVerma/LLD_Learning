package multiThreading.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // task class object
        // create the thread using the task class
        // start the thread

//        ExecutorService executor = Executors.newScheduledThreadPool(10);
//       long startTime = System.currentTimeMillis();
//        for(int i=1;i<=50; i++){
//            if(i==5 || i==11 | i== 20){
//                Thread.sleep(1000);
//                System.out.println("Debug");
//            }
//            CubePrinter cubePrinter = new CubePrinter(i);
//            executor.execute(cubePrinter);
//        }
//        System.out.println("Debug");
//
//        executor.shutdown();
//        long endTime = System.currentTimeMillis();

        List<Integer> list = List.of(1,5,6,3,2,9,0,10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> futureSortedList = executorService.submit(mergeSorter);
        List<Integer> sortedList = futureSortedList.get();
        System.out.println("Sorted List : " + sortedList);
    }
}
