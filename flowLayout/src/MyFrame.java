import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        // by default frames use a border layout
        //
        // but they can also take on a flow layout approach where elements can flow and
        // change depending on the
        // screen width
        // we can also identify where we want our flow layour to start when we create a
        // flow layout
        // we can also set the padding when we create our layout
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        // we can also change the flow layout for panels
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("1");

        panel.add(button1);

        // a shortcut to adding elements to a frame is just creating its instance within
        // the add function
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));

        this.add(panel);

        this.setVisible(true);

    }
}
