package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Pool;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EntryPoint {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        Arrays.stream(Tasks.values())
                .map(task-> new Task(task))
                .forEach(pool::submit);

        pool.shutdown();

    }

    public void DemoExecutor() throws InterruptedException, ExecutionException {
        ExecutorService threadPool =  Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000);
            System.out.println("It's callable");
            return 1;
        });

        System.out.println("Result " + future.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1,TimeUnit.HOURS);
        System.out.println("Main end");
    }
}
