import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import lab01.tdd.CircularListWithIterators;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListWithIteratorsTest {

    private CircularListWithIterators list;

    @BeforeEach
    void beforeEach(){
        this.list = new CircularListWithIterators();
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
    void testForwardIterator(){
        simpleInserts();
        Iterator<Integer> iterator = this.list.forwardIterator();
        assertEquals(0, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(0, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
    }

    @Test
    void testBackwardIterator(){
        simpleInserts();
        Iterator<Integer> iterator = this.list.backwardIterator();
        assertEquals(2, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(0, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(0, iterator.next());
    }
}
