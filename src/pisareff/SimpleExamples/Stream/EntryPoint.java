package pisareff.SimpleExamples.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Ваня","Саша","Пётр","Гусь хрустальный","Яблоко","Крокодил");

        List<String> handledStrings = strings.stream()
                .limit(5)
                .map(String::toUpperCase)
                .skip(1)
                .sorted((arg1,arg2)-> arg1.length()-arg2.length())
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(handledStrings);
    }
}
