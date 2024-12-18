package pisareff.SimpleExamples.NestedClasses.StaticMemberClass_NestedClass;

public class Car {
    private int id;

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class StaticClass {
        private static int value = 1;

        public static void add(){
            value += 1;
        }

        public static void getValue(){
            System.out.println(value);
        }

    }
}
