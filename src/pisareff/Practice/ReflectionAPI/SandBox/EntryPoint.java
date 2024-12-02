package pisareff.Practice.ReflectionAPI.SandBox;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EntryPoint {
    public static void main(String[] args) {
       User user = new User(25L, "Alexander");
       Class<? extends User> userClass = user.getClass();   //? - wildcard используется для обозначения неизвестного тип
        System.out.println(userClass);

            }
}
