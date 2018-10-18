import java.util.*;

public class CountryTester
{
    public static void main(String[] args)
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("India", 176220));
        countries.add(new Country("United States Of America", 514000));
        countries.add(new Country("China", 30510));

        Collections.sort(countries, Country.createComparatorByName(true));
        System.out.println("Increasing Order:");

        for (Country c : countries)
            System.out.println(c.getName() + " " + c.getArea());

        System.out.println();
        System.out.println("Decreasing Order:");
        Collections.sort(countries, Country.createComparatorByName(false));

        for (Country c : countries)
            System.out.println(c.getName() + " " + c.getArea());

        System.out.println();
        System.out.println("Increasing Order:");
        Collections.sort(countries, Country.createComparatorByArea(true));

        for (Country c : countries)
            System.out.println(c.getName() + " " + c.getArea());

        System.out.println();
        System.out.println("Decreasing Order:");
        Collections.sort(countries, Country.createComparatorByArea(false));

        for (Country c : countries)
            System.out.println(c.getName() + " " + c.getArea());
    }
}