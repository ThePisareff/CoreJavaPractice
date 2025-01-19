package pisareff.patterns.abstractModel;

import pisareff.patterns.abstractModel.Util.RankComporator;
import pisareff.patterns.abstractModel.classes.Employee;
import pisareff.patterns.abstractModel.classes.Manager;
import pisareff.patterns.abstractModel.classes.SeniorSupervisor;
import pisareff.patterns.abstractModel.classes.Supervisor;

import java.util.ArrayList;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {

        SeniorSupervisor seniorSupervisor = new SeniorSupervisor("Alexander", 1000, 5, 1);
        Supervisor supervisor = new Supervisor("Vitaliy", 1000, 1);
        Manager manager = new Manager("Semen", 1000);

        List<Employee> list = new ArrayList<>();

        list.add(seniorSupervisor);
        list.add(supervisor);
        list.add(manager);

        System.out.println(list.get(0).getClass().getName());
        System.out.println(list.get(1).getClass().getName());
        System.out.println(list.get(2).getClass().getName());

        System.out.println(RankComporator.compareRank(list.get(2),list.get(1)));


        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        System.out.println(manager.getRank());
    }
}
