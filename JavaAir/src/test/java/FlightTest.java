import Crew.CabinCrewMember;
import Crew.Pilot;
import Crew.Rank;
import Plane.Plane;

import org.junit.Before;
import Plane.PlaneType;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;

    Plane plane1;

    @Before
    public void before() {
        pilot1 = new Pilot("Grinch", Rank.PILOT, "1234");
        ArrayList<CabinCrewMember> cabinCrewMembers1 = new ArrayList<>();
        CabinCrewMember flightAttendant1 = new CabinCrewMember("Rudolf Rednose", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers1.add(flightAttendant1);
        ArrayList<Passenger> bookedPassengers1 = new ArrayList<>();
        Passenger passenger1 = new Passenger("Santa Clause", 3);
        bookedPassengers1.add(passenger1);
        plane1 = new Plane(PlaneType.AIRBUS_220);
        flight = new Flight
                (pilot1, cabinCrewMembers1, bookedPassengers1, plane1, "AB123", "Tokyo", "GLA", "12:00");
    }

    @Test
    public void flightHasPilot() {
        assertEquals("Grinch", flight.flightHasPilot());
    }

    @Test
    public void flightHasCabinCrewMembers() {
        assertEquals(1, flight.getNumOfCabinCrewMembers());
    }

    @Test
    public void flightHasBookedPassengers() {
        assertEquals(1, flight.getNumOfBookedPassengers());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(PlaneType.AIRBUS_220, flight.getPlane().getType());
    }

    @Test
    public void flightHasFlightNum() {
        assertEquals("AB123", flight.getFlightNum());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("Tokyo", flight.getDestination());
    }

    @Test
    public void flightHasDeptAirport() {
        assertEquals("GLA", flight.getDeptAirport());
    }

    @Test
    public void flightHasDeptTime() {
        assertEquals("12:00", flight.getDeptTime());
    }

    @Test
    public void flightHasAvailableSeats() {

        assertEquals(549, flight.getAvailableSeats());
    }

    @Test
    public void flightCanBookPassenger() {
        Passenger passenger2 = new Passenger("Mrs Clause", 2);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getNumOfBookedPassengers());
    }

//    @Test
//    public void flightHasBaggageWeightAllowance() {
//        assertEquals(2, flight.getBaggeWeightAllowance());
//    }
}

