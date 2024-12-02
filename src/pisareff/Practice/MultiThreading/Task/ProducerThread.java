package pisareff.Practice.MultiThreading.Task;

import java.util.Queue;

public class ProducerThread implements Runnable{

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if(list.size() < 10) {
                    int random = RandomUtil.getRandom();
                    list.add(random);
                    System.out.println("Producer add value: " + random + ". Size= " + list.size());
                } else {
                    System.out.println("Producer is waits, list is full");
                }
                try {
                    int randomWaitValue = RandomUtil.getRandom();
                    System.out.println("Producer waits: " + randomWaitValue);
                    list.wait(randomWaitValue);
                    //list.notifyAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
