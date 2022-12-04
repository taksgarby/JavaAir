package Plane;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getType() {
        return planeType;
    }

    public int getCapacity() {
        return planeType.getCAPACITY();
    }

    public int getTotalWeight() {
        return planeType.getTOTAL_WEIGHT();
    }
}
