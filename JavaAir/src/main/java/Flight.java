import Crew.CabinCrewMember;
import Crew.Pilot;
import Plane.Plane;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;

    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private ArrayList<Passenger> bookedPassengers;

    private Plane plane;

    private String flightNum;

    private String destination;

    private String deptAirport;

    private String deptTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> bookedPassengers,
                  Plane plane, String flightNum, String destination, String deptAirport,
                  String deptTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.bookedPassengers = bookedPassengers;
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.deptAirport = deptAirport;
        this.deptTime = deptTime;
    }


    public String flightHasPilot() {
        return pilot.getName();
    }

    public int getNumOfCabinCrewMembers() {
        return cabinCrewMembers.size();
    }

    public int getNumOfBookedPassengers() {
        return bookedPassengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }


    public String getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDeptAirport() {
        return this.deptAirport;
    }

    public String getDeptTime() {
        return this.deptTime;
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - this.getNumOfBookedPassengers();
    }

    public void bookPassenger(Passenger passenger2) {

        int availableSeats = getAvailableSeats();
        if (availableSeats != 0) this.bookedPassengers.add(passenger2);
    }
}
