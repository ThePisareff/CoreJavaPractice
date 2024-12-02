package pisareff.SimpleExamples.MultiThreading.RaceCondition;

/**
 * <H2><i>{@code Volatile}</i></H2>
 * <p>модификатор применияемый только к примитивным типам данных!!!
 * <p>Отключает оптимизации языка Java.
 * <p>В данной демонстрации показано отключение использования кеша процессора.
 * <p>
 * <p>Без данного модификатора может произойти ситуация, когда из-за использования кеша, переменная flag
 * может измениться в thread2, но thread1 не увидит изменения и продолжит исполняться.
 * <p>Произойти данная ситуация может по двум причинам.
 * <p>1) Thread2 использовал кеш, но не сразу отобразил изменения в RAM из за чего thread1 продолжил исполнение.
 * <p>2) Thread1 использовал кеш, но не обновил его из оперативной памяти из-за чего продолжил выполняться
 * <p> для демонстрации примера запустите метод {@linkplain  VolatileDemo#startDemo()}
 */
public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void startDemo() throws InterruptedException {
        Thread thread1= new Thread(() -> {
            while(!flag){
                System.out.print("still false, ");
            }
        });
        System.out.print(thread1.getName() + " started ");
        thread1.start();
        thread1.sleep(5L);

        Thread thread2= new Thread(() -> {
            flag = true;
            System.out.println("");
            System.out.print(Thread.currentThread().getName() + " set true");
        });
        thread2.start();
        Thread.sleep(5);
        flag = false;
        System.out.println("");
    }
}
