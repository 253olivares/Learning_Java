import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrame() {
        // make our program terminate when we click on the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // reset our layout to be flow instead of border layout
        this.setLayout(new FlowLayout());
        // make our window compact on all the elements to get rid of any empty space

        // create a button instance
        pizzaButton = new JRadioButton("Pizza!");
        hamburgerButton = new JRadioButton("Hamburger!");
        hotdogButton = new JRadioButton("Hotdog!");

        // if we ant to set images in our radio button we need to create image icons
        pizzaIcon = new ImageIcon();
        hamburgerIcon = new ImageIcon();
        hotdogIcon = new ImageIcon();

        // then set our icons
        // since it is a built in feature our radio button object will take care of the
        // rest
        // it replaces our radio bubbles for whatever the icon is used
        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        ButtonGroup group = new ButtonGroup();

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        // Make our window visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered a pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }

}
