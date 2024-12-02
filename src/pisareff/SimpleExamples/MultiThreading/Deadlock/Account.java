package pisareff.SimpleExamples.MultiThreading.Deadlock;

public class Account {
    private static int idGenerator = 1;
    private int id;
    private int balance;

    public Account(int balance) {
        this.balance = balance;
        this.id = idGenerator++;
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
