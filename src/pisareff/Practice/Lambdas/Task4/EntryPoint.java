package pisareff.Practice.Lambdas.Task4;

import java.util.Arrays;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "grape");
        //strings.replaceAll(String::toUpperCase);
        strings.replaceAll((value)->value.toUpperCase());
        System.out.println(strings);
    }
}
