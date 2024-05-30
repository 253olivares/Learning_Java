import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        // JPanel = a GUI component that functions as a container to hold other
        // components

        ImageIcon icon = new ImageIcon("thumbs-up-emoji-1905x2048-yh44rgtn.png");

        JLabel label = new JLabel();
        label.setText("HI");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelRed = new JPanel();
        panelRed.setBackground(Color.red);
        panelRed.setBounds(0, 0, 250, 250);

        JPanel panelBlue = new JPanel();
        panelBlue.setBackground(Color.blue);
        panelBlue.setBounds(250, 0, 250, 250);

        JPanel panelGreen = new JPanel();
        panelGreen.setBackground(Color.green);
        panelGreen.setBounds(0, 250, 500, 250);
        panelGreen.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        panelGreen.add(label);
        frame.add(panelRed);
        frame.add(panelBlue);
        frame.add(panelGreen);
    }
}
