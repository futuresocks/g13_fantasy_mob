import org.junit.Before;
import org.junit.Test;
import players.warriors.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp() throws Exception {
        barbarian = new Barbarian("Bobby Slayer");
    }


    @Test
    public void canGetHealthPoints() {
        assertEquals(80, barbarian.getHealthPoints());
    }


}
