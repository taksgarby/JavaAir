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


    public int getBaggegeWeightBooked() {
        return getBaggageWeightAllowance()*myFlight.getNumOfBookedPassengers();
    }

    public int getRemainingWeight() {
        return myFlight.getPlane().getTotalWeight() - getBaggegeWeightBooked();
    }
}

