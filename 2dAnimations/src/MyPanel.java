import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image enemy;
    Image backgroundImage;

    Timer timer;

    int xVelocity;
    int yVelocity;

    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        enemy = new ImageIcon("image.png").getImage();

        backgroundImage = new ImageIcon("background.png").getImage();

        // every second run our command paired
        timer = new Timer(1000, this);
        // start our timer
        timer.start();

    }

    public void paint(Graphics g) {

        // paint background
        // for now it defaults to black since thats what we set it oo

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        // this will draw our image to the panel
        g2D.drawImage(enemy, x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        // check to see if our enemy hits the edges of the screen
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x <= 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y <= 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        x = x + xVelocity;
        repaint();

    }
}
