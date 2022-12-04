
import Crew.CabinCrewMember;
import Crew.Pilot;
import Crew.Rank;
import Plane.Plane;
import Plane.PlaneType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

    ArrayList<Passenger> bookedPassengers1;


    @Before
    public void before() {
        Pilot pilot1 = new Pilot("Grinch", Rank.PILOT, "1234");
        ArrayList<CabinCrewMember> cabinCrewMembers1 = new ArrayList<>();
        CabinCrewMember flightAttendant1 = new CabinCrewMember("Rudolf Rednose", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers1.add(flightAttendant1);
        bookedPassengers1 = new ArrayList<>();
        Passenger passenger1 = new Passenger("Santa Clause", 3);
        bookedPassengers1.add(passenger1);
        Plane plane1 = new Plane(PlaneType.AIRBUS_220);
        Flight flight1 = new Flight
                (pilot1, cabinCrewMembers1, bookedPassengers1, plane1, "AB123", "Tokyo", "GLA", "12:00");
        flightManager = new FlightManager(flight1);

    }

    @Test
    public void calculateBaggageWeightAllowance() {
        assertEquals(2, flightManager.getBaggageWeightAllowance());
    }
    
    @Test
    public void calculateBaggageWeightBooked() {
        Passenger passenger2 = new Passenger("Mrs Clause", 2);
        bookedPassengers1.add(passenger2);
        assertEquals(4, flightManager.getBaggegeWeightBooked());
    }

    @Test
    public void calculateRemainingWeight() {
        Passenger passenger2 = new Passenger("Mrs Clause", 2);
        bookedPassengers1.add(passenger2);
        assertEquals(1196, flightManager.getRemainingWeight());
    }
}
