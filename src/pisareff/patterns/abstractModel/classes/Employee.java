package pisareff.patterns.abstractModel.classes;

import java.util.Comparator;
import java.util.concurrent.locks.ReadWriteLock;

public abstract class Employee implements Rankable {

    private static final int RANK = 0;
    private final String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getRank(){
        return RANK;
    }

}
