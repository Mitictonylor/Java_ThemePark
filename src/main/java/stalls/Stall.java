package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public abstract class Stall implements IReviewed{

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private int ratings;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int ratings) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public int getRating(){
        return this.ratings;
    };

}
