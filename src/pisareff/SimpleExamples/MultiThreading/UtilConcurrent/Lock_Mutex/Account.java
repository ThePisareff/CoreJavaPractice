package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Lock_Mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private final Lock lock = new ReentrantLock();
    private static int idGenerator = 1;
    private int id;
    private int balance;

    public Account(int balance) {
        this.balance = balance;
        this.id = idGenerator++;
    }

    public Lock getLock(){
        return lock;
    }

    public void add(int money) {
        balance += money;
    }

    public boolean takeOff(int money) {
        if(balance >= money) {
            balance -= money;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
