import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame {

    JLabel label = new JLabel("Hello!");

    NewWindow() {

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);

        this.setVisible(true);
    }
}
