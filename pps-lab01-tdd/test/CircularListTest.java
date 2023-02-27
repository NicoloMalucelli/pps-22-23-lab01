import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testAddElement(){
        this.list.add(0);
        assertEquals(1, this.list.size());
    }
}
