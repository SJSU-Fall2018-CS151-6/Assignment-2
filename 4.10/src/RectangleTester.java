import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class RectangleTester
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle2D> list = new ArrayList<>();
        list.add(new Rectangle2D.Double(100,100,50,50));
        list.add(new Rectangle2D.Double(120,80,54,75));
        list.add(new Rectangle2D.Double(85,95,60,55));
        list.add(new Rectangle2D.Double(100,95,55,55));
        list.add(new Rectangle2D.Double(100,95,55,52));

        System.out.println("\nUnsorted Rectangles:");
        for (Rectangle2D temp : list)
            System.out.println(temp.toString() + " Y: " + temp.getY());

        Comparator<Rectangle2D> comp = new
                Comparator<Rectangle2D>()
                {
                    public int compare(Rectangle2D r1, Rectangle2D r2)
                    {
                        Double r1X = r1.getX();
                        Double r2X = r2.getX();
                        Double r1Y = r1.getY();
                        Double r2Y = r2.getY();
                        Double r1Width = r1.getWidth();
                        Double r2Width = r2.getWidth();
                        Double r1Height = r1.getHeight();
                        Double r2Height = r2.getHeight();

                        int result = r1X.compareTo(r2X);
                        if (result == 0) {
                            result = r1Y.compareTo(r2Y);
                        }
                        if (result == 0) {
                            result = r1Width.compareTo(r2Width);
                        }
                        if (result == 0) {
                            result = r1Height.compareTo(r2Height);
                        }
                        return result;
                    }
                };

        Collections.sort(list, comp);

        System.out.println("\nSorted Rectangles:");
        for (Rectangle2D temp : list)
            System.out.println(temp.toString());
    }
}
