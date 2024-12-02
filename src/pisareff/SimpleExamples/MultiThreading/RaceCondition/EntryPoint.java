package pisareff.SimpleExamples.MultiThreading.RaceCondition;

public class EntryPoint {
    public static void main(String[] args) throws InterruptedException {
        nonSynchronizedClassDemonstration();
    }

    public static void nonSynchronizedClassDemonstration () throws InterruptedException{
        TestClass testClass = new TestClass(0);
        ThreadDemo threadDemo = new ThreadDemo(testClass);
        ThreadDemo threadDemo2 = new ThreadDemo(testClass);
        ThreadDemo threadDemo3 = new ThreadDemo(testClass);
        ThreadDemo threadDemo4 = new ThreadDemo(testClass);
        ThreadDemo threadDemo5 = new ThreadDemo(testClass);
        ThreadDemo threadDemo6 = new ThreadDemo(testClass);
        ThreadDemo threadDemo7 = new ThreadDemo(testClass);
        ThreadDemo threadDemo8 = new ThreadDemo(testClass);
        ThreadDemo threadDemo9 = new ThreadDemo(testClass);

        threadDemo.start();
        threadDemo2.start();
        threadDemo3.start();
        threadDemo4.start();
        threadDemo5.start();
        threadDemo6.start();
        threadDemo7.start();
        threadDemo8.start();
        threadDemo9.start();

        threadDemo.join();
        threadDemo2.join();
        threadDemo3.join();
        threadDemo4.join();
        threadDemo5.join();
        threadDemo6.join();
        threadDemo7.join();
        threadDemo8.join();
        threadDemo9.join();

        System.out.println("Итог =" + testClass.getI());
    }

    public static void synchronizedClassDemonstration() throws InterruptedException{
        TestClass testClass = new TestClass(0);
        ThreadDemoSynchronized threadDemoSynchronized1 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized2 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized3 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized4 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized5 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized6 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized7 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized8 = new ThreadDemoSynchronized(testClass);
        ThreadDemoSynchronized threadDemoSynchronized9 = new ThreadDemoSynchronized(testClass);

        threadDemoSynchronized1.start();
        threadDemoSynchronized2.start();
        threadDemoSynchronized3.start();
        threadDemoSynchronized4.start();
        threadDemoSynchronized5.start();
        threadDemoSynchronized6.start();
        threadDemoSynchronized7.start();
        threadDemoSynchronized8.start();
        threadDemoSynchronized9.start();

        threadDemoSynchronized1.join();
        threadDemoSynchronized2.join();
        threadDemoSynchronized3.join();
        threadDemoSynchronized4.join();
        threadDemoSynchronized5.join();
        threadDemoSynchronized6.join();
        threadDemoSynchronized7.join();
        threadDemoSynchronized8.join();
        threadDemoSynchronized9.join();

        System.out.println("Итог =" + testClass.getI());
    }

    public static void volatileClassDemonstration() throws InterruptedException{
        for(int i = 0; i < 20; i++){
            VolatileDemo.startDemo();
        }
    }
}

