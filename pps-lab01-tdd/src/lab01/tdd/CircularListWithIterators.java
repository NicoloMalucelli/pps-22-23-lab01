package lab01.tdd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListWithIterators{
    private final List<Integer> list = new LinkedList<>();

    public void add(int element) {
        list.add(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Iterator<Integer> next() {
        return null;
    }

    public Iterator<Integer> previous() {
        return null;
    }
}
