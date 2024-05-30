import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class myFrame extends JFrame {
    myFrame() {

        // get our screensize
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

        int screenWidth = (int) screensize.getWidth();
        int screenHeight = (int) screensize.getHeight();

        // JLabel
        JLabel label = new JLabel(); // create our label
        label.setText("Womp Womp!"); // set text of label

        // create an image icon
        ImageIcon image = new ImageIcon("png-2702691_640.png", "Check out this cool cat!");

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set Text Left, Center, Right of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text Top, Center, Bottom of imageIcon

        label.setForeground(Color.blue); // set font color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 50)); // set font of text

        label.setIconTextGap(15); // text gap between text and image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true);

        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 100, 500, 500); // set x and y position of frame

        System.out.println(image.getImage());
        System.out.println(image.getIconWidth());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize((int) screenWidth / 2, (int) screenHeight / 2);
        // this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.pack();

    }
}
