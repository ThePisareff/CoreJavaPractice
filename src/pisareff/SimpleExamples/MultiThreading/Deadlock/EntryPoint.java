package pisareff.SimpleExamples.MultiThreading.Deadlock;

public class EntryPoint {
    public static void main(String[] args) throws InterruptedException {
       Account account1 = new Account(20000);
       Account account2 = new Account(20000);

       AccountThread thread1 = new AccountThread(account1, account2);
       AccountThread thread2 = new AccountThread(account2, account1);

       thread1.start();
       thread2.start();

       thread1.join();
       thread2.join();

       System.out.println(account1);
       System.out.println(account2);

    }
}
