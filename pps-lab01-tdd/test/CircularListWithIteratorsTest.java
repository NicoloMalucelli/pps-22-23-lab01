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
    void emptyAtStart(){
        assertTrue(this.list.isEmpty());
    }

    @Test
    void sizeZeroAtStart(){
        assertEquals(this.list.size(), 0);
    }

    @Test
    void testAdd(){

    }
}
