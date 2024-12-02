package pisareff.Practice.Lambdas.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredNumbers = numbers.stream()
                .filter((Value)-> Value % 3 == 0)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(filteredNumbers);
    }
}
