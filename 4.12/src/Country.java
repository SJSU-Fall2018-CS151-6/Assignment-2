import java.util.Comparator;

public class Country implements Comparable<Country>
{
    public Country(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    public String getName()
    {
        return name;
    }


    public double getArea()
    {
        return area;
    }

    public static Comparator<Country> createComparatorByName(final boolean increasing)
    {
        Comparator<Country> name = new
                Comparator<Country>()
                {
                    public int compare(Country country1, Country country2)
                    {
                        if(increasing)
                        {
                            return country1.getName().compareTo(country2.getName());
                        }
                        return country2.getName().compareTo(country1.getName());
                    }
                };
        return name;
    }
    public static Comparator<Country> createComparatorByArea(final boolean increasing)
    {
        Comparator<Country> area = new
                Comparator<Country>()
                {
                    public int compare(Country country1, Country country2)
                    {
                        if(increasing)
                        {
                            return (int)(country1.getArea() - (country2.getArea()));
                        }
                        return (int)(country2.getArea() - (country1.getArea()));
                    }
                };
        return area;
    }


    public int compareTo(Country other)
    {
        if (area < other.area) return -1;
        if (area > other.area) return 1;
        return 0;
    }

    private String name;
    private double area;
}