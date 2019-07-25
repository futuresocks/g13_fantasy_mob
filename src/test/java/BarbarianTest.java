import org.junit.Before;
import org.junit.Test;
import players.warriors.Barbarian;
import players.warriors.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp() throws Exception {
        Sword sword = new Sword();
        barbarian = new Barbarian("Bobby Slayer", sword);
    }


    @Test
    public void canGetHealthPoints() {
        assertEquals(80, barbarian.getHealthPoints());
    }


}
