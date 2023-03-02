package lab01.tdd.step3;

import lab01.tdd.CircularList;
import lab01.tdd.step2.CircularListWithIterators;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public Optional<Integer> filteredNext(Predicate<? super Integer> predicate){
        Optional<Integer> res = Stream.concat(list.subList(i, list.size()).stream(), list.subList(0, i).stream())
                .filter(predicate)
                .findFirst();
        if(!res.isEmpty()){
            this.i = 1 + IntStream.concat(IntStream.range(i, list.size()), IntStream.range(0, 1))
                    .filter(j -> list.get(j) == res.get())
                    .findFirst()
                    .getAsInt();
        }
        return res;
    }
}