package lab01.tdd.step3;

import lab01.tdd.CircularList;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularFilterableList {

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

    public Optional<Integer> filteredNext(){
        return null;
    }

}
