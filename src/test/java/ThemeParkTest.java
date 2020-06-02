
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import attractions.RollercoasterTest;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;


public class ThemeParkTest {

    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    TobaccoStall tobaccoStall;
    ThemePark themePark;

    @Before
    public void setUp() {
    dodgems = new Dodgems("dodgem", 8);
    playground = new Playground("playg", 5);
    rollerCoaster = new RollerCoaster("roller", 9);
    candyflossStall = new CandyflossStall("candy", "floss", ParkingSpot.A1,6);
    tobaccoStall = new TobaccoStall("T","smokey", ParkingSpot.B1, 8);
    themePark = new ThemePark();
    themePark.addAttractions(dodgems);
    themePark.addAttractions(playground);
    themePark.addAttractions(rollerCoaster);
    themePark.addStalls(candyflossStall);
    themePark.addStalls(tobaccoStall);

    }

    @Test
    public void canAddAndCountAttractions() {
        assertEquals(3, themePark.countAttractions());
    }
    @Test
    public void canAddAndCountStalls() {
        assertEquals(2, themePark.countStalls());
    }

}
