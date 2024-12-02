package pisareff.Practice.ReflectionAPI.Task;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) {
        Car car = new Car("Toyota","Corolla");
        System.out.println(car);
        generateInsert(car);
    }

    private static void generateInsert(Car car) {
        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";
        Table table = car.getClass().getAnnotation(Table.class);
        Field[] fields = car.getClass().getDeclaredFields();

        String fieldsNames = Arrays.stream(fields)
                .map(field -> field.getAnnotation(Column.class))
                .map(coolumn -> coolumn.name())
                .collect(Collectors.joining(", "));

        String fieldsValues = Arrays.stream(fields)
                .peek(field -> field.setAccessible(true))
                .map(field -> {
                    try {
                        return String.valueOf(field.get(car));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(currentString -> "'" + currentString + "'")
                .collect(Collectors.joining(", "));

        String message = String.format(template,table.schema() ,table.value(), fieldsNames, fieldsValues);
        System.out.println(message);


    }
}