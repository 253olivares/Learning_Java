import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Panel extends JPanel {

    Image img;

    Panel() {
        img = new ImageIcon("sky.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    // autmatically invoked behind the scenes because also all gui
    // objects in java are created using the component class
    public void paint(Graphics g) {
        // cast our g as graphics 2d object
        Graphics2D g2D = (Graphics2D) g;

        // adding an image to our canvas
        g2D.drawImage(img, 0, 0, null);
        // Image currently does not exist so it should just currently return an error
        // for now.

        // line color
        g2D.setPaint(Color.BLUE);

        // set stroke of drawLine
        g2D.setStroke(new BasicStroke(20));

        // draws a line from the top left of our window the bottom right
        g2D.drawLine(0, 0, 500, 500);

        // every time we draw an item we need to set its stroke and paint color again

        g2D.drawRect(100, 100, 200, 200);

        // some objects have a diff method to call if u want to create an object but
        // filled
        // g2D.fillRect(100, 100, 200, 200);

        // when creating objects it will fill the window based on what is created first
        // to last
        // it is how the graphics controls the z axis of the items

        g2D.drawArc(20, 20, 100, 100, 0, 180);
        // draws a partial circle depending on the angle and degrees input

        g2D.fillArc(20, 20, 100, 100, 180, 360);

        // cordinate of the points
        int[] xPoints = { 150, 250, 350 };
        int[] yPoints = { 300, 250, 300 };

        // drawing a polygon
        g2D.drawPolygon(xPoints, yPoints, 3);

        // drawing a string
        // one minor unorthidox behavior is that strings display based on its bottom
        // right point instead of starting at its top left
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U r a winner :D", 50, 50);

    }

}
