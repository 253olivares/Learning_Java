import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.WHITE);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("Enter your Username:");

        // we can disable a text field but setting its edit to false
        // textField.setEditable(false);

        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            String textFieldValue = textField.getText();
            textField.setText("");
            System.out.println(textFieldValue);
            // disable our button after we submit
            button.setEnabled(false);
        }
    }
}
