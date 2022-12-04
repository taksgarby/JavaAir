package Crew;

public class CabinCrewMember  {

    private final Crew.Rank Rank;
    private String name;


    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.Rank = rank;
    }


    public Crew.Rank getRank() {
        return this.Rank;
    }

    public String getName() {
        return this.name;
    }

    public String relayMessage(String message) {
        return message;
    }
}
