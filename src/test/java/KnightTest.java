import org.junit.Before;
import org.junit.Test;
import players.warriors.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Sir Bobby Slayer");
    }

    @Test
    public void hasArmour() {
        assertEquals(30, knight.getArmour());
    }

    @Test
    public void addPointsToArmour(){
        knight.addToArmour(10);
        assertEquals(40, knight.getArmour());
    }

    @Test
    public void canTakeDamage(){
        knight.reduceHealth(50);
        assertEquals(0, knight.getArmour());
        assertEquals(20, knight.getHealthPoints());
    }
}
