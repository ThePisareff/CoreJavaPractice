package pisareff.SimpleExamples.NestedClasses.InnerClasses.AnonymousClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "grape");
        System.out.println(strings);

        var comparator = new Comparator<String>() {
            @Override
            public int compare(String S1, String S2) {
                return S1.length()-S2.length();
            }
        };

        strings.sort(comparator);
        System.out.println(strings);
    }
}
