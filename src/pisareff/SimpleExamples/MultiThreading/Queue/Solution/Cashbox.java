package pisareff.SimpleExamples.MultiThreading.Queue.Solution;

public class Cashbox {
    private static int idGenerator = 1;
    private int id;

    public Cashbox(){
        id = idGenerator++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}
