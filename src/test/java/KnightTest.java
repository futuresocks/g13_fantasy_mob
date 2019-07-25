import com.sun.tools.corba.se.idl.EnumEntry;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.warriors.Knight;
import players.warriors.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Troll troll;

    @Before
    public void before(){
        Sword sword = new Sword();
        knight = new Knight("Sir Bobby Slayer", sword);
        troll = new Troll("Stevie Meiklejohn");
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

    @Test
    public void canAttackEnemy(){
        knight.attack(troll);
        assertEquals(0, troll.getHealthPoints());
        assertEquals(true, troll.isDead());
    }
}
