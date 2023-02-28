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
        assertEquals(iterator.next(), 0);
        assertEquals(iterator.next(), 1);
        assertEquals(iterator.next(), 2);
        assertEquals(iterator.next(), 0);
        assertEquals(iterator.next(), 1);
        assertEquals(iterator.next(), 2);
    }
}
