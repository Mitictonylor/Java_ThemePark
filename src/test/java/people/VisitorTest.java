package people;

import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("dodgem", 8);
        rollerCoaster = new RollerCoaster("roller", 9);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void  canAddAttractions(){
        visitor.addAttraction(rollerCoaster);
        assertEquals(1, visitor.countVisitedAttractions());
    }
}
