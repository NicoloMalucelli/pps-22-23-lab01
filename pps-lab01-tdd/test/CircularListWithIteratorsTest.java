import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import lab01.tdd.CircularListWithIterators;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void testMultipleAdds(){
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertEquals(this.list.size(), 3);
    }


    @Test
    void testAdd(){

    }
}
