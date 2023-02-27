package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList{

    private final List<Integer> list = new LinkedList<>();
    private int i;
    @Override
    public void add(int element) {
        list.add(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Optional<Integer> next() {
        if(this.list.isEmpty()){
            return Optional.empty();
        }
        if(i == list.size()){
            i = 0;
        }
        return Optional.of(list.get(i++));
    }

    @Override
    public Optional<Integer> previous() {
        return Optional.empty();
    }

    @Override
    public void reset() {

    }
}
