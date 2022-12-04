package Crew;

public class Pilot extends CabinCrewMember {

    private String licenceNum;

    public Pilot(String name, Rank rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }

    public String getLicenceNum() {
        return this.licenceNum;
    }

    public String flyPlane(String flyingSound) {
        return flyingSound;
    }

}
