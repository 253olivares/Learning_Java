import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    // we can also set custom values to our progress bar
    // JProgressbar bar = new JProgressBar(0,500);

    ProgressBarDemo() {

        bar.setValue(0);

        // Create bounds for our progress bar locationx,locationy,width,height
        bar.setBounds(0, 0, 420, 50);

        // Adds a percentage to our progress bar so the user can see how far along it is
        bar.setStringPainted(true);

        bar.setFont(new Font("MV Boli", Font.BOLD, 50));
        // this will chang the color for our progress bar
        bar.setForeground(Color.blue);
        // set the background color of the bar
        bar.setBackground(Color.black);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        // fill our progress bar

        int counter = 0;

        while (counter <= 100) {

            // the main idea is that as the program completes task to get all its resources
            // a user can change its values when the methods complete letting the user known
            // how much closer they are to being complete

            bar.setValue(counter);

            // create a loop that adds to our bar untill its 100
            try {
                // have our program sleep for a second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bar.setString("Done :)");
    }
}
