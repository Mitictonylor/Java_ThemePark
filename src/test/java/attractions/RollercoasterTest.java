package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor14180;
    Visitor visitor14140;
    Visitor visitor10180;
    Visitor visitor10140;
    Visitor visitor18205;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor10140= new Visitor(10,1.40,10.00);
        visitor10180= new Visitor(10,1.80,10.00);
        visitor14140= new Visitor(14,1.40,10.00);
        visitor14180= new Visitor(14,1.80,10.00);
        visitor18205= new Visitor(18,2.05,30.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRollercoaster__overAge__overHeight() {
        assertTrue(rollerCoaster.isAllowedTo(visitor14180));
    }
    @Test
    public void isAllowedToRollercoaster__overAge__underHeight() {
        assertFalse(rollerCoaster.isAllowedTo(visitor14140));
    }
    @Test
    public void isAllowedToRollercoaster__underAge__underHeight() {
        assertFalse(rollerCoaster.isAllowedTo(visitor10140));
    }
    @Test
    public void isAllowedToRollercoaster__underAge__overHeight() {
        assertFalse(rollerCoaster.isAllowedTo(visitor10180));
    }

    @Test
    public void getTicketPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(),0.01);
    }
    @Test
    public void getTicketPrice__doubleForTallerThan200cm() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor18205),0.01);
    }
    @Test
    public void getTicketPrice__normalForLessTallerThan200cm() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor14180),0.01);
    }
}
