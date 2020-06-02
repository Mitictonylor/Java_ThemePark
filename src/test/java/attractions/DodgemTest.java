package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor14140;
    Visitor visitor10180;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor10180= new Visitor(10,1.80,10.00);
        visitor14140= new Visitor(14,1.40,10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }
    @Test
    public void getTicketPrice() {
        assertEquals(4.5, dodgems.defaultPrice(),0.01);
    }
    @Test
    public void getTicketPrice__HalfForYoungerThan12() {
        assertEquals(2.25, dodgems.priceFor(visitor10180),0.01);
    }
    @Test
    public void getTicketPrice__normalForOlderThan12() {
        assertEquals(4.50, dodgems.priceFor(visitor14140),0.01);
    }
}
