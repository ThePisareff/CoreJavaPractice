package pisareff.patterns.abstractModel.classes;

public class SeniorSupervisor extends Supervisor implements Rankable {

    private static final int RANK = 3;

    private int countOfSupervisors;

    public SeniorSupervisor(String name, int salary, int countOfManagers, int countOfSupervisors) {
        super(name, salary, countOfManagers);
        this.countOfSupervisors = countOfSupervisors;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + countOfSupervisors * 300;
    }

    @Override
    public int getRank() {
        return RANK;
    }
}