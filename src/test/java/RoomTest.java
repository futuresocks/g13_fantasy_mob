import enemies.Troll;
import org.junit.Before;
import players.warriors.Knight;
import roomStuffMagicBeans.Treasure;
import rooms.Room;

public class RoomTest {

    Room room;
    Troll troll;
    Treasure treasure;
    Knight knight;

    @Before
    public void setUp(){
        troll = new Troll("Steve Mieklejohn");
        treasure = new Treasure();
        knight = new Knight("Sir Bobby Slayer");
        room = new Room();

    }

}
