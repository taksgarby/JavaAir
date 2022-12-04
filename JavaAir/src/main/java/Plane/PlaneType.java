package Plane;

public enum PlaneType {

    BOEING_747(700, 1400),
    AIRBUS_220(550, 1200),
    MITSUBISHI(600, 1300),
    BOEING_777(1000, 2000);

    private final int CAPACITY;
    private final int TOTAL_WEIGHT;

    PlaneType(int capacity, int totalWeight) {
        CAPACITY = capacity;
        TOTAL_WEIGHT= totalWeight;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getTOTAL_WEIGHT() {
        return TOTAL_WEIGHT;
    }


}
