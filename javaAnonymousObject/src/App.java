import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        // nameless object by not declaring variables
        // after putting it all in our deck to create on instance
        // we start to loop
        for (int i = 1; i <= 52; i++) {
            deck.add(new JLabel(new ImageIcon("src\\cards\\1.png")));
            frame.add(deck.get(i - 1));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
