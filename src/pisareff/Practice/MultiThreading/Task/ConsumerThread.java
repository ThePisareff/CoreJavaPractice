package pisareff.Practice.MultiThreading.Task;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("Consumer get value " + removedValue + ". Size= " + list.size());
                } else {
                    System.out.println("Consumer is waiting, list is empty");
                }

                try {
                    int random = RandomUtil.getRandom();
                    System.out.println("Consumer is waiting: " + random);
                    list.wait(random);
                    //list.notifyAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
