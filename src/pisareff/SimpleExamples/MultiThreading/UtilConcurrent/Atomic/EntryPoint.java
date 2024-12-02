package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class EntryPoint {
    public static void main(String[] args) {
         AtomicInteger atomicIntegernteger = new AtomicInteger();
         int value = atomicIntegernteger.addAndGet(10);
         System.out.println(value);
         value = atomicIntegernteger.addAndGet(10);
        System.out.println(value);

    }
}
