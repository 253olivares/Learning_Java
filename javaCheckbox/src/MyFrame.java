import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton();
    JCheckBox checkbox = new JCheckBox();

    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // adding text to our button
        button.setText("submit");
        // create am action listener that will trigger our action performed method
        button.addActionListener(this);

        // this text will usually site tot he right of our check box as a label
        checkbox.setText("I'M not a robot!");
        // allow our checkbox to be labels
        checkbox.setFocusable(false);
        // set the font for our checkbox
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 35));

        // if we wanted a custom image for our icon we could set image icons using the
        // code below
        // first it sets the unchekced icon and then we called the setSelected to set
        // the selected image
        checkbox.setIcon(xIcon);
        checkbox.setSelectedIcon(xIcon);

        // then add it to our JFrame
        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println(checkbox.isSelected());
        }
    }

}
