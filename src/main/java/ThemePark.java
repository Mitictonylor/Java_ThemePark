import attractions.Attraction;
import stalls.Stall;

public class ThemePark {

    Attraction attractions;
    Stall stalls;

    public ThemePark(Attraction attractions, Stall stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public Attraction getAttractions() {
        return attractions;
    }

    public Stall getStalls() {
        return stalls;
    }


}
