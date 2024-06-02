import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color!");
        // bind our button to our action listener
        button.addActionListener(this);

        // create a label
        label = new JLabel();

        // creating a background for our label
        label.setBackground(Color.white);
        // add text
        label.setText("Text!");
        // change the text font
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        // when adding backgrounds to labels we need to see the opaque so we can see it
        label.setOpaque(true);

        // add it to the frame
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == button) {
            // our color chooser is already a pre existing component
            JColorChooser colorChooser = new JColorChooser();

            // our color chooser will create a dialog box with several color options all
            // that needs to be passed
            // is a component, title for our modal, and a default color select
            Color color = colorChooser.showDialog(null, "Pick a color!", Color.black);

            // set the background color
            label.setBackground(color);
        }

    }
}
