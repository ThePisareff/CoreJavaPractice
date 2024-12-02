package pisareff.Decks.RawCollections;

import java.util.Comparator;

public class Shuffler<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return (int) (Math.random()*((1- -1)+1))+-1;
    }
}
