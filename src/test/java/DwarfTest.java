import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Plop Undergrowth");
    }

    @Test
    public void getName() {
        assertEquals("Plop Undergrowth", dwarf.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(20, dwarf.getHealthPoints());
    }

    @Test
    public void treasureArrayStartsEmpty() {
        assertEquals(0, dwarf.getTreasures().size());
    }
}
