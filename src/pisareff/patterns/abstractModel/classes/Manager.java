package pisareff.patterns.abstractModel.classes;

public class Manager extends Employee {

    private static final int RANK = 1;
    private int numberOfTransactions = 0;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void CommitTransactions(){
        numberOfTransactions++;
    }

    @Override
    public int getSalary(){
        return super.getSalary() + numberOfTransactions * 100;
    }

    @Override
    public int getRank() {
        return RANK;
    }
}
