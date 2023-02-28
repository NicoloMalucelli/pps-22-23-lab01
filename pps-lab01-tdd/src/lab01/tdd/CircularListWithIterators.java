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

    public Iterator<Integer> forwardIterator() {
        return new CircularListIterator(this.list);
    }

    public Iterator<Integer> backwardIterator() {
        return null;
    }


    private class CircularListIterator implements Iterator<Integer>{
        private final CircularList circularList = new CircularListImpl();

        public CircularListIterator(List<Integer> list){
            for (Integer i: list) {
                this.circularList.add(i);
            }
        }


        @Override
        public boolean hasNext() {
            return !circularList.isEmpty();
        }

        @Override
        public Integer next() {
            return circularList.next().get();
        }
    }

}
