package pisareff.patterns.singletone;

public class EntryPoint {
    public static void main(String[] args) {

        SingletoneClass singletone1 = SingletoneClass.getInstance();
        SingletoneClass singletone2 = SingletoneClass.getInstance();

        singletone1.setData("Hello singletone");
        System.out.println(singletone2.getData());
    }
}
