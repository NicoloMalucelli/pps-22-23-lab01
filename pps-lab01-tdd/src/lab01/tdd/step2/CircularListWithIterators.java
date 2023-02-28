package lab01.tdd.step2;

import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
        return new CircularListIterator(this.list, Direction.FORWARD);
    }

    public Iterator<Integer> backwardIterator() {
        return new CircularListIterator(this.list, Direction.BACKWARD);
    }

    public enum Direction {FORWARD, BACKWARD}
    private class CircularListIterator implements Iterator<Integer>{
        private final CircularList circularList = new CircularListImpl();
        private final Direction direction;

        public CircularListIterator(List<Integer> list, Direction direction){
            this.direction = direction;
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
            if(direction == Direction.FORWARD) {
                return circularList.next().get();
            }else{
                return circularList.previous().get();
            }
        }
    }

}
