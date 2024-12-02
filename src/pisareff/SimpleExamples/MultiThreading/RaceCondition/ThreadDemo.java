package pisareff.SimpleExamples.MultiThreading.RaceCondition;

public class ThreadDemo extends Thread {
    private TestClass testClass;

    ThreadDemo(TestClass testClass){
        this.testClass = testClass;
    }

    @Override
    public void run() {
       for (int j = 0; j<1000; j++) {
               int buffer = testClass.getI();
               buffer++;
               testClass.setI(buffer);
           }

        System.out.println("end of work "+ getName() +" at moment of time i = "+ testClass.getI());

       }



}
