package pisareff.SimpleExamples.NestedClasses.InnerClasses.LocalClasses_MethodLocalClass;

public class EntryPoint {
    public static void main(String[] args) {
        int j;
        test();
    }

    public static void test(){

        int k = 5;

        class LocalClass{
            private int i;

            public LocalClass(int i) {
                this.i = i;
            }

            public int calculate(){
                return k + i;
            }
        }

        LocalClass localClass = new LocalClass(5); //Создание объекта возможно только ПОСЛЕ объявления локального класса
        System.out.println(localClass.calculate());

    }

}
