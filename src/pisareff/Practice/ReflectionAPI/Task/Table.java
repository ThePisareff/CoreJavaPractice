package pisareff.Practice.ReflectionAPI.Task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    String schema() default "public";

    String value(); // Зарезервированное значение (как значение по умолчанию)

}
