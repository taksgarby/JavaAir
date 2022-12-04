import Plane.Plane;
import Plane.PlaneType;

public class FlightManager {

    private Flight myFlight;

    public FlightManager(Flight myFlight) {
        this.myFlight = myFlight;
    }



    public int getBaggageWeightAllowance() {

        return myFlight.getPlane().getTotalWeight() / myFlight.getPlane().getCapacity();

    }


}

