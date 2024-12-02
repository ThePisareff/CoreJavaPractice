package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Latch;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EntryPoint {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(RocketDetail.values().length);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Rocket(countDownLatch));
        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunable(detail, countDownLatch))
                .forEach(executorService::submit);

        executorService.shutdown();
    }
}
