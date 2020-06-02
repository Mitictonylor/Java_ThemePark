
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ThemeParkTest {

    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    TobaccoStall tobaccoStall;
    ThemePark themePark;
    Visitor visitor;

    @Before
    public void setUp() {
    dodgems = new Dodgems("dodgem", 8);
    playground = new Playground("play", 5);
    rollerCoaster = new RollerCoaster("roller", 9);
    candyflossStall = new CandyflossStall("candy", "floss", ParkingSpot.A1,6);
    tobaccoStall = new TobaccoStall("T","smokey", ParkingSpot.B1, 8);
    themePark = new ThemePark();
    themePark.addAttractions(dodgems);
    themePark.addAttractions(playground);
    themePark.addAttractions(rollerCoaster);
    themePark.addStalls(candyflossStall);
    themePark.addStalls(tobaccoStall);
    visitor = new Visitor(25,1.90,100.0);

    }

    @Test
    public void canAddAndCountAttractions() {
        assertEquals(3, themePark.countAttractions());
    }
    @Test
    public void canAddAndCountStalls() {
        assertEquals(2, themePark.countStalls());
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(5, themePark.getAllReviewed().size());
    }
    @Test
    public void canIncrementVisitCountAndAddAttractionToVisitor(){
        assertEquals(0,rollerCoaster.getVisitCount());
        assertEquals(0, visitor.countVisitedAttractions());
        themePark.visit(rollerCoaster,visitor);
        assertEquals(1,rollerCoaster.getVisitCount());
        assertEquals(1, visitor.countVisitedAttractions());
    }
    @Test
    public void canCreateAnHashMapWithNameAndRatingOfIReviewed(){
        assertTrue(themePark.allReviews().containsKey("roller"));
        assertTrue(themePark.allReviews().containsKey("play"));
        assertTrue(themePark.allReviews().containsKey("candy"));
        assertTrue(themePark.allReviews().containsKey("dodgem"));
        assertTrue(themePark.allReviews().containsKey("T"));
    }
}
