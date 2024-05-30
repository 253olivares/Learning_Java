import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// implement action listener
public class MyFrame extends JFrame implements ActionListener {

    private JButton button;
    JLabel label;

    MyFrame() {

        label = new JLabel();
        label.setText("Hello!");
        label.setBounds(150, 250, 150, 150);
        label.setBackground(Color.red);
        label.setVisible(false);

        this.button = new JButton();
        this.button.setBounds(100, 50, 250, 100);
        // button will now trigger action listener
        this.button.addActionListener(this);
        this.button.setText("Click me!");
        this.button.setFocusable(false);

        // a shortcut to trigger an event listener is to use the lambda listener which
        // does not require you to
        // implement ActionListener to the class and a actionPerformed method override
        // instead the new line of code will be
        // this.button.addActionListener(e -> System.out.println("Poo!"))

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    // action perform method for our button
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // get the source of the button
        if (e.getSource() == button) {
            System.out.println("Poop");
            label.setVisible(true);
        }
    }
}
