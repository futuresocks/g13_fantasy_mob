import org.junit.Before;
import org.junit.Test;
import players.magicusers.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp(){
        wizard = new Wizard("Paul Daniels");
    }

    @Test
    public void hasAName() {
        assertEquals("Paul Daniels", wizard.getName());
    }


}
