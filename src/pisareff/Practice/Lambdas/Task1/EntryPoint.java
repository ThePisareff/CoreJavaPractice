

package pisareff.Practice.Lambdas.Task1;

import java.util.Arrays;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "grape");
        System.out.println(strings);

        strings.sort((S1, S2)-> S1.length()-S2.length());
        System.out.println(strings);

    }
}
