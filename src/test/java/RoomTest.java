import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.warriors.Knight;
import players.warriors.weapons.Sword;
import roomStuffMagicBeans.Treasure;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Troll troll;
    Treasure treasure;
    Knight knight;

    @Before
    public void setUp(){
        troll = new Troll("Steve Mieklejohn");
        treasure = new Treasure();
        Sword sword = new Sword();
        knight = new Knight("Sir Bobby Slayer", sword);
        room = new Room(treasure, troll);
        room.setPlayer(knight);
    }

    @Test
    public void canCompleteRoom(){
        room.play();
        assertEquals(null, room.getTreasure());
        assertEquals(true, room.getEnemy().isDead());
        assertEquals(1, knight.countOfTreasure());
    }


}
