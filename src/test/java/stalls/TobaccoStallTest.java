package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor10;
    Visitor visitor18;
    Visitor visitor25;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor10 = new Visitor(10,1.50, 20.00);
        visitor18 = new Visitor(18,1.20, 15.00);
        visitor25 = new Visitor(25,2.00, 30.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }
    @Test
    public void IsAllowedToTobacco__BelowMinAge() {
        assertFalse(tobaccoStall.isAllowedTo(visitor10));
    }
    @Test
    public void IsAllowedToTobacco__ExactMinAge() {
        assertTrue(tobaccoStall.isAllowedTo(visitor18));
    }
    @Test
    public void IsAllowedToTobacco__OverMinAge() {
        assertTrue(tobaccoStall.isAllowedTo(visitor25));
    }
}
