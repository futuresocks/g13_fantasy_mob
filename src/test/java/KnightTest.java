import org.junit.Before;
import org.junit.Test;
import players.Knight;

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
}
