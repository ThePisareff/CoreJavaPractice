package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CyclicBarrier barrier;

    public RocketDetailRunable(RocketDetail rocketDetail, CyclicBarrier barrier) {
        this.rocketDetail = rocketDetail;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println("RocketDetailRunable is prepearing " + rocketDetail);
        try {
            Thread.sleep(1000);
            System.out.println("Rocket detail is ready and await: " + rocketDetail);
            barrier.await();
            System.out.println("Деталь использована " + rocketDetail);
        } catch (BrokenBarrierException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
