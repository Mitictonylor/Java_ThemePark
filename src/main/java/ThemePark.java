import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

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
        reviewed.addAll(this.stalls);
        reviewed.addAll(this.attractions);
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

    public HashMap<String,Integer> allReviews(){
        HashMap<String,Integer> reviews = new HashMap<String, Integer>();
        for (IReviewed review : this.getAllReviewed()){
            reviews.put(review.getName(),review.getRating());
        }
        return reviews;
    }
    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
        ArrayList<IReviewed> allowed = new ArrayList<IReviewed>();
        for(IReviewed reviewed: this.getAllReviewed()){
            if (reviewed instanceof ISecurity){
               if( ((ISecurity) reviewed).isAllowedTo(visitor)){
                   allowed.add(reviewed);
               }
            }else{
                allowed.add(reviewed);
            }
        }

        return allowed;
    }
}
