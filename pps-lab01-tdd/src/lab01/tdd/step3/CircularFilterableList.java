package lab01.tdd.step3;

import lab01.tdd.CircularList;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CircularFilterableList {

    private final List<Integer> list = new LinkedList<>();
    private int i;

    public void add(int element) {
        list.add(element);
    }

    public void clear(){this.list.clear();}

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
