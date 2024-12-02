package pisareff.Practice.Lambdas.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "grape");

        List<Integer> lengths = strings.stream()
                .map((value) -> {return value.length();})
                .collect(Collectors.toList());
        //Нейросетка подсказала, надо привыкать мыслить ссылками на методы
        List<Integer> lengths2 = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(lengths);
        System.out.println(lengths2);
    }
}
