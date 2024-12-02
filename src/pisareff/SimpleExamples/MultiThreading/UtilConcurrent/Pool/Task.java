package pisareff.SimpleExamples.MultiThreading.UtilConcurrent.Pool;

public class Task extends Thread{

    private final Tasks taskToDo;

    public Task(Tasks taskToDo) {
        this.taskToDo = taskToDo;
    }

    public void run() {
       System.out.println("Task started " + taskToDo.name());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task finished " + taskToDo.name());
    }
}
