package pisareff.SimpleExamples.MultiThreading.RaceCondition;

public class TestClass {
    private int i;

    public TestClass(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
