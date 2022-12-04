import Plane.Plane;
import Plane.PlaneType;

public class FlightManager {

    private Plane planeInstance;

    public FlightManager(Plane planeInstance) {
        this.planeInstance = planeInstance;
    }


    public int getBaggageWeightAllowance() {

        int planeCapacity = planeInstance.getType().getCAPACITY();
        int planeTotalWeight = planeInstance.getType().getTOTAL_WEIGHT();
        int baggageWeightAllowance = Math.round(planeTotalWeight / planeCapacity);

        return baggageWeightAllowance;

        // PlaneType is a class, not an object. So PlaneType.getCAPACITY would be a class level
        // method that returns the same thing every time and could not refer to a particular
        // instasnce of the class. If you had defined
        // PlaneType myPlane
        // and then ran myPlane.getCAPACITY()
        // that would have returned the capacity of a particular instance of a plane (an object)
        // private Pilot pilot; is defining an instance of a pilot
        // return pilot.getName(); is returning the name of that instance

    }


}

