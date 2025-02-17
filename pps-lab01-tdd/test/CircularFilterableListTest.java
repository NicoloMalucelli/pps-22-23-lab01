import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import lab01.tdd.step2.CircularListWithIterators;
import lab01.tdd.step3.CircularFilterableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
* The test suite for testing the CircularList implementation
*/
public class CircularFilterableListTest {

    private CircularFilterableList list;

    @BeforeEach
    void beforeEach(){
        this.list = new CircularFilterableList();
    }

    @Test
    void testIsEmptyAtStart(){
        assertTrue(this.list.isEmpty());
    }

    @Test
    void testSizeZeroAtStart(){
        assertEquals(this.list.size(), 0);
    }

    @Test
    void testNotEmptyAfterAdd(){
        this.list.add(0);
        assertFalse(this.list.isEmpty());
    }

    private void simpleInserts(){
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
    }

    @Test
    void testMultipleAdds(){
        simpleInserts();
        assertEquals(this.list.size(), 3);
    }

    @Test
    void testEmptyAfterClear(){
        simpleInserts();
        this.list.clear();
        assertTrue(this.list.isEmpty());
    }

    @Test
    void testFilteredNextWithEmptyList(){
        assertEquals(Optional.empty(), this.list.filteredNext(i -> i==0));
    }

    @Test
    void testFilteredNextWhenNoItemMatch(){
        simpleInserts();
        assertEquals(Optional.empty(), this.list.filteredNext(i -> i==4));
    }

    @Test
    void testFilteredNextWhenItemMatch(){
        simpleInserts();
        assertEquals(Optional.of(1), this.list.filteredNext(i -> i==1));
    }

    @Test
    void testFilteredNextWhenMultipleItemsMatch(){
        simpleInserts();
        this.list.filteredNext(i -> i%2==0);
        assertEquals(Optional.of(2), this.list.filteredNext(i -> i%2==0));
    }
}
