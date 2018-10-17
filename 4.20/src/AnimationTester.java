import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 This program implements an animation that moves
 a plane shape.
 */
public class AnimationTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);

        final ShapeIcon icon = new ShapeIcon(shape,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;

        Timer t = new Timer(DELAY, new
                ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        if (((CarShape) shape).x == FRAME_WIDTH) {
                            ((CarShape) shape).x = 0;

                            ((CarShape) shape).y = 0;
                        }

                        shape.translate(1, 0);
                        label.repaint();
                    }
                });
        t.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
}
