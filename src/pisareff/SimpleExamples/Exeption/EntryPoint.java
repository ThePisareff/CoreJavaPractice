package pisareff.SimpleExamples.Exeption;

public class EntryPoint {
    public static void main(String[] args) {
        ExeptionHandler();

        try {
            ExeptionThrower();
        }
        catch (ClassCastException exception)
        {
            System.out.println("Отловили ExeptionThrower в Main");
        }
        System.out.println("Main отработал полностью");
    }
    public static void ExeptionHandler(){
        try {
            ExeptionGenerator(true);
        }
        catch (ClassCastException exception)
        {
            System.out.println("Отловили в ExeptionHandler");
        }
        finally {
            System.out.println("Ловим не ловим,но выполняем это всегда");
        }

        System.out.println("ExeptionHandler отработал полностью");

    }

    public static void ExeptionThrower() throws ClassCastException{
        ExeptionGenerator(true);
        System.out.println("ExeptionThrower отработал полностью");
    }
    public static void ExeptionGenerator(boolean createExeption) throws ClassCastException {
        if (createExeption) {
            System.out.println("ExeptionGenerator responce - генерирую исключение");
            throw new ClassCastException();
        }

        System.out.println("ExeptionGenerator responce - отработал до конца, без генерации ошибки");
    }
}
