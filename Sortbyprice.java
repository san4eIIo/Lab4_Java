package Lab4;

import java.util.Comparator;

public class Sortbyprice implements Comparator<Cosmetics> {
    @Override
    public int compare(Cosmetics o1, Cosmetics o2) {
        return o1.Price - o2.Price;
    }
}
