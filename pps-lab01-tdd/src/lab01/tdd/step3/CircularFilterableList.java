package lab01.tdd.step3;

import lab01.tdd.CircularList;
import lab01.tdd.step2.CircularListWithIterators;

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

    public Optional<Integer> filteredNext(Predicate<? super Integer> predicate){
        Optional<Integer> res = this.list.subList(i, this.list.size()).stream().filter(predicate).findFirst();
        if(!res.isEmpty()){
            this.updateIndex(res);
            return res;
        }
        res = this.list.subList(0, i).stream().filter(predicate).findFirst();
        this.updateIndex(res);
        return res;
    }

    private void updateIndex(Optional<Integer> n){
        if(n.isEmpty()){
            return;
        }

        for(int j = i; j < this.list.size(); j++){
            if(this.list.get(j) == n.get()){
                this.i = j+1;
                return;
            }
        }

        for(int j = 0; j < i; j++){
            if(this.list.get(j) == n.get()){
                this.i = j+1;
                return;
            }
        }
    }
}
