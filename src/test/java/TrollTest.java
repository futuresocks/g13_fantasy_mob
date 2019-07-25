import Enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void setup(){
        troll = new Troll("Stevie Meiklejohn");
    }

    @Test
    public void canGetTrollName(){
        assertEquals("Stevie Meiklejohn", troll.getName());
    }



}

