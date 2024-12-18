package pisareff.SimpleExamples.NestedClasses.InnerClasses.NonStatickMemberClass_InnerClass;

public class EntryPoint {
    public static void main(String[] args) {
        Car car = new Car("E860BO", 3252155, 777);
        Car.CarHandler carHandler = car.new CarHandler();

        carHandler.start();
        carHandler.changeCarNumber("X666XX");
        System.out.println(" ");
        System.out.println(carHandler.getBodyNumber());
        carHandler.start();
    }


}
