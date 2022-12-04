import Crew.CabinCrewMember;
import Crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() { cabinCrewMember = new CabinCrewMember("Frosty Snowman", Rank.FIRST_OFFICER);}

    @Test
    public void cabinCrewHasRank() {
        assertEquals(Rank.FIRST_OFFICER, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewHasName() {
        assertEquals("Frosty Snowman", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewCanRelayMessage() {
        String message = "We are about to take off.";
        assertEquals("We are about to take off.",cabinCrewMember.relayMessage(message) );
    }

}
