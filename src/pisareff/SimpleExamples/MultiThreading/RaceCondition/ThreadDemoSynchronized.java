package pisareff.SimpleExamples.MultiThreading.RaceCondition;

public class ThreadDemoSynchronized extends Thread {
    private TestClass testClass;

    ThreadDemoSynchronized(TestClass testClass){
        this.testClass = testClass;
    }

    @Override
    public void run() {
        for (int j = 0; j<1000; j++) {
            synchronized(TestClass.class){
                int buffer = testClass.getI();
                buffer++;
                testClass.setI(buffer);
            }
//           System.out.println(buffer);
        }
        System.out.println("end of work "+ getName() +" i at moment of time "+ testClass.getI());
    }

}
