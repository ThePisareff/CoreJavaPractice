package pisareff.SimpleExamples.SyntaxAndFeatures;

/*
Классы-оболочки для некоторых примитивных типов (Byte, Short, Integer, Long (от -128 до 127),
Character (от 0 до 127), Boolean(true,false) кешируют часто используемые значения. Это означает,
что для определенного диапазона значений объекты-оболочки будут повторно использоваться,
что может улучшить производительность и уменьшить использование памяти.
Так же инстанцирование с помощью Integer e = new Integer(127); является depricated методом. IDE сама
рекомендует инстанцирование с помощью valueOf()
 */

public class WrappersClassCacheDemo {
    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); // false так как находится вне ренжа кеша
        System.out.println("");

        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d); // true так как находится в ренже кеша
        System.out.println("");

        Integer e = new Integer(127);
        Integer f = new Integer(127);
        System.out.println(e == f); // false всегда, так как конструктор выделяет память и не берет из кеша
        System.out.println("");

        Integer g =  Integer.valueOf(127);
        Integer h =  Integer.valueOf(127);
        System.out.println(g == h); // true так как находится в ренже кеша
        System.out.println("");

        Integer i =  Integer.valueOf(128);
        Integer j =  Integer.valueOf(128);
        System.out.println(i == j); // false так как находится вне ренжа кеша
    }
}
