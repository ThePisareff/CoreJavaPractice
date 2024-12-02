package pisareff.SimpleExamples.Lambda;

public class EntryPoint {
    public static void main(String[] args) {
        MyInterface<String> myinterface;

        myinterface = (S1,S2) -> {
            String S3 = S1 + S2;
            return S3.length();
        };

        System.out.println(myinterface.InterfaceFunction("Dick","Pick"));
    }
}
