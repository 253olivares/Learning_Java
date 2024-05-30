import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        // JFrame = is a GUI window to add components to

        // get window screensize
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

        // only need this when we are creating a frame that does not extend jFrame
        // since we are we dont have to worry about creating a new instance since our
        // class is the instance
        // JFrame frame = new JFrame(); // creates a frame for us to use

        // set the title of our window name
        this.setTitle("JFrame title here!");

        // this function lets us over ride our exist button for our window
        // otherwise the default for Jthi.e is to just have our window hide
        // exit on close lets us terminate our program
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize((int) screensize.getWidth() / 2, (int) screensize.getHeight() / 2); // this sets our dimension of
                                                                                         // our frame how big
        // we want it
        // to be;

        // this lets us prevent our frame from being resized but we dont want to do this
        // we want to let the user resize our window!
        // frame.setResizable(false);
        ImageIcon image = new ImageIcon("logo.png");

        this.setIconImage(image.getImage()); // change icon of the frame
        // frame.getContentPane().setBackground(Color.BLUE); // change inside color of
        // pane
        this.getContentPane().setBackground(new Color(255, 150, 25)); // we can create custom colors from the color
                                                                      // object by doing this

        // this will allow us to see our frame
        this.setVisible(true);
    }
}
