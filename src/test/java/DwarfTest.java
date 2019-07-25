import org.junit.Before;
import org.junit.Test;
import players.warriors.Dwarf;
import roomStuffMagicBeans.Treasure;

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

    @Test
    public void canReduceHealthPoints(){
        dwarf.reduceHealth(1);
        assertEquals(19,dwarf.getHealthPoints());
    }

    @Test
    public void canAddTreasure(){
        Treasure treasure = new Treasure();
        dwarf.addTreasure(treasure);
        assertEquals(1, dwarf.countOfTreasure());
    }
}
