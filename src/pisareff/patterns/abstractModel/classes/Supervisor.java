package pisareff.patterns.abstractModel.classes;

public class Supervisor extends Employee {

    private static final int RANK = 2;
    private int countOfManagers;

    public Supervisor(String name, int salary, int countOfManagers) {
        super(name, salary);
        this.countOfManagers = countOfManagers;
    }

    public Supervisor(String name, int salary) {
        super(name, salary);
        countOfManagers = 1;
    }

    public void addManager(){
        countOfManagers++;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + countOfManagers * 200;
    }

    @Override
    public int getRank() {
        return RANK;
    }

}
