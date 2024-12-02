package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CountDownLatch latch;

    public RocketDetailRunable(RocketDetail rocketDetail, CountDownLatch latch) {
        this.rocketDetail = rocketDetail;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("RocketDetailRunable is prepearing " + rocketDetail);
        try {
            Thread.sleep(1000);
            System.out.println("Rocket detail is ready: " + rocketDetail);
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
