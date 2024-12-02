package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.CyclicBarrier;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EntryPoint {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(RocketDetail.values().length, ()-> System.out.println(" rocket launched"));
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunable(detail,barrier))
                .forEach(threadPool::execute);

        threadPool.shutdown();

    }
}
