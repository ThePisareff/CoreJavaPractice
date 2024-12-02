package pisareff.SimpleExamples.MultiThreading.Queue.Solution;

import java.util.Queue;

public class BuyerThread implements Runnable{
    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) { // Фиксирует монитор ВСЕХ касс (т.е. блокирует пулл-лист касс для доступа), что не корректно по отношению к другим потокам
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " Обслуживается в кассе " + cashbox);

                        cashboxes.wait(5); // Освобождает монитор пулла касс, для того что бы другой поток смог взять кассу на исполнение

                        System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                        break;

                    } else {
                        System.out.println(Thread.currentThread().getName() + " Ожидает свободную кассу");
                        cashboxes.wait();
                    }
                }
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
