package Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Cosmetics {
    public String Brand;
    public String Name;
    public int Price;
    public int Rate;
    public String Country;

    public Cosmetics(String brand, String name, int price, int rate,String country){
        Brand = brand;
        Name = name;
        Price = price;
        Rate = rate;
        Country = country;
    }
    public String toString(){
        return this.Brand +" " + this.Name + " " + this.Price + "uah " + "rate:" + this.Rate +" " + this.Country;
    }
}