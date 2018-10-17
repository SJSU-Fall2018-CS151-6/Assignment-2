import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

/**
 A class for testing a clock icon by updating it each second
 */
public class ClockTester
{
    /**
     Creates a clock and a timer to update the clock every second.
     @param args unused
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        ClockIcon icon = new ClockIcon(400);
        final JLabel label = new JLabel(icon);

        final int FIELD_WIDTH = 20;

        frame.setLayout(new FlowLayout());

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}