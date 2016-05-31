package example.codeclan.com.beer_adviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31/05/2016.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        if (color.equals("blonde")) {
            brands.add("Amstel");
        }

        if (color.equals("dark")) {
            brands.add("Guinness");
        }

        if (color.equals("red")) {
            brands.add("Red Moose");
        }

        return brands;
    }
}
