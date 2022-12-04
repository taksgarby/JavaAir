import Crew.Pilot;
import Crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Jack Frost", Rank.PILOT, "12345");
    }

    @Test
    public void pilotHasLicenceNum() {
        assertEquals("12345", pilot.getLicenceNum());
    }

    @Test
    public void pilotCanFlyPlane() {
        String flyingSound = "Brrrrrrr";
        assertEquals("Brrrrrrr", pilot.flyPlane(flyingSound));
    }

}
