import Plane.Plane;
import Plane.PlaneType;

public class FlightManager {

    private Flight myFlight;

    public FlightManager(Flight myFlight) {
        this.myFlight = myFlight;
    }



    public int getBaggageWeightAllowance() {

        return myFlight.getPlane().getTotalWeight() / 2 / myFlight.getPlane().getCapacity() ;

    }


    public int getBaggageWeightBooked() {
        return getBaggageWeightAllowance()*myFlight.getNumOfBookedPassengers();
    }

    public int getRemainingWeight() {
        return myFlight.getPlane().getTotalWeight() - getBaggageWeightBooked();
    }
}

