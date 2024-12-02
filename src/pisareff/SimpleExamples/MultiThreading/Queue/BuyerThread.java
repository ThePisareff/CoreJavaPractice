package pisareff.SimpleExamples.MultiThreading.Queue;

import java.util.Queue;

public class BuyerThread implements Runnable{
    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!cashboxes.isEmpty()) {
                    Cashbox cashbox = cashboxes.remove();
                    System.out.println(Thread.currentThread().getName() + " Обслуживается в кассе " + cashbox);

                    Thread.sleep(5);

                    System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashbox);
                    cashboxes.add(cashbox);
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " Ожидает свободную кассу");
                    Thread.sleep(5);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
