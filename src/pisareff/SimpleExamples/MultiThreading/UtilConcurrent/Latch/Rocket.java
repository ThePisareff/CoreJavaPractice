package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {
    private final CountDownLatch latch;

    public Rocket(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Rocket prepearing to start");

        try {
            latch.await();
            System.out.println("Rocket has been launched");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
