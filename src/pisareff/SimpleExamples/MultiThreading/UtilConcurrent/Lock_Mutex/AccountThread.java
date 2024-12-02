package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Lock_Mutex;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    /*
     * Для разрешения дедлоков в данном примере используется Lock из java.util.concurrent
     */

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try{
                if (accountFrom.takeOff(10)) {
                    accountTo.add(10);
                }
            } finally {
            unlockAccounts();
            }
        }
    }

    private void lockAccounts() {
        while (true) {
            boolean fromLockResult = accountFrom.getLock().tryLock();
            boolean toLockResult = accountTo.getLock().tryLock();
            if (fromLockResult && toLockResult) {
                break;
            }
            if (fromLockResult) {
                accountFrom.getLock().unlock();
            }
            if (toLockResult) {
                accountTo.getLock().unlock();
            }
        }
    }

    private void unlockAccounts() {
        accountFrom.getLock().unlock();
        accountTo.getLock().unlock();
    }
}
