import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS_220);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.AIRBUS_220, plane.getType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(550, plane.getCapacity());
    }

    @Test
    public void planeHasTotalWeight() {
        assertEquals(1200, plane.getTotalWeight());
    }



}
