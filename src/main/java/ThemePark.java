import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

private ArrayList<Attraction> attractions;
private ArrayList<Stall> stalls;

    public ThemePark() {
      this.attractions = new ArrayList<Attraction>();
      this.stalls = new ArrayList<Stall>();
    }

    public void addAttractions(Attraction attraction){
        this.attractions.add(attraction);
    }
    public void addStalls(Stall stall){
        this.stalls.add(stall);
    }

    public int countAttractions() {
        return this.attractions.size();
    }
    public int countStalls() {
        return this.stalls.size();
    }
    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        for(Stall stall :this.stalls){
            reviewed.add(stall);
        }
        for(Attraction attraction :this.attractions){
            reviewed.add(attraction);
        }
        return reviewed;
    }

    public void visit(Attraction attraction, Visitor visitor) {
        for (Attraction anAttraction : this.attractions){
            if (anAttraction == attraction){
                attraction.addVisit();
                visitor.addAttraction(attraction);
            }
        }
    }
}
