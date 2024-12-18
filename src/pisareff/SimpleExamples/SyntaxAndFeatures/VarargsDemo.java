package pisareff.SimpleExamples.SyntaxAndFeatures;

public class VarargsDemo {
    public static void main(String[] args) {
        demoVarargs(1,2,3,4);
    }

    private static void demoVarargs(int... ints){
        System.out.println(ints[1]);
        for(int i : ints){
            System.out.println(i);
        }
    }
}
