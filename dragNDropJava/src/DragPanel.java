import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Point;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    // get our image
    ImageIcon image = new ImageIcon("images.jpg");
    // get its width
    final int WIDTH = image.getIconWidth();
    // get its height
    final int HEIGHT = image.getIconHeight();

    Point imageCorner;
    Point prevPt;

    DragPanel() {

        // set image point at the top left corner
        imageCorner = new Point(0, 0);

        // create listeners
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        // bind our listeners to our panel and pointing them to our click and drag
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g) {
        // repaint our image when we move it
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());

    }

    // a method for when we click
    private class ClickListener extends MouseAdapter {
        // get our current points
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    // this will listen and help move our panel when clicked
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {

            // cet current cords
            Point currentPt = e.getPoint();

            // translate based on our points drag distance in translate
            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY()));

            // as we drag we will continue to execute this method as long as we dont let go
            // so we need to set our pev points with each render
            // change our points
            prevPt = currentPt;
            // paint the image
            repaint();
        }
    }

}
