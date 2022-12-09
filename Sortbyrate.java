package Lab4;

import java.util.Comparator;

public class Sortbyrate implements Comparator<Cosmetics> {
    public int compare(Cosmetics o1, Cosmetics o2){
        return o2.Rate - o1.Rate;
    }
}
