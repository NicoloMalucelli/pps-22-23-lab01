import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    //TODO: test implementation
    private CircularList list;

    @BeforeEach
    void beforeEach(){
        this.list = new CircularListImpl();
    }

    @Test
    void testSizeAtCreation(){
        assertEquals(0, this.list.size());
    }

    @Test
    void testAddOneElement(){
        this.list.add(0);
        assertEquals(1, this.list.size());
    }

    @Test
    void testMultipleAdds(){
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertEquals(3, this.list.size());
    }

    @Test
    void testEmptyListAtCreation(){
        assertTrue(this.list.isEmpty());
    }

    @Test
    void testNotEmptyAfterAdd(){
        this.list.add(0);
        assertFalse(this.list.isEmpty());
    }

    @Test
    void testNextWithEmptyList(){
        assertTrue(this.list.next().isEmpty());
    }

    @Test
    void testNextAfterAdd(){
        this.list.add(0);
        assertEquals(this.list.next().get(), 0);
    }
}
