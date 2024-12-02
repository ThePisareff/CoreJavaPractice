package pisareff.SimpleExamples.MultiThreading.Deadlock;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    /*
     * При зеркалировании аккаунтов для двух потоков может случится Deadlock.
     * в данном примере при увеличении количества итераций может случится взаимная блокировка
     * на первых блоках синхронизации. Это когда первый поток захватывает монитор аккаунт_1
     * а второй поток захватывает монитор второго аккаунта аккаунт_2.
     * Во втором блоке соответсвенно возникает блокировка. Когда первый поток пытается захватить аккаунт_2
     * а он уже захвачен вторым потоком. Соответственно во втором потоке зеркальная ситуация.
     *
     * start         synchronized (accountFrom)      synchronized (accountTo) ┌ DEADLOCKED
     * thread1 ────>       >>account1<<        ────X   account2 (locked yet) ─┤
     * thread2 ────>       >>account2<<        ────X   account1 (locked yet) ─┘
     */

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    if (accountFrom.takeOff(10)) {
                        accountTo.add(10);
                    }
                }
            }
        }
    }
}
