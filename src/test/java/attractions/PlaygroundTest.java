package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor15;
    Visitor visitor8;
    Visitor visitor19;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor15 = new Visitor(15,1.50, 20.00);
        visitor8 = new Visitor(8,1.20, 15.00);
        visitor19 = new Visitor(19,2.00, 30.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canUseThePlayground__BelowMaxAge() {
        assertTrue(playground.isAllowedTo(visitor8));
    }
    @Test
    public void canUseThePlayground__ExactMaxAge() {
        assertTrue(playground.isAllowedTo(visitor15));
    }
    @Test
    public void canUseThePlayground__OverMaxAge() {
        assertFalse(playground.isAllowedTo(visitor19));
    }
}
