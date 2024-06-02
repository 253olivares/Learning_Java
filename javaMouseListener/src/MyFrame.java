import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements ActionListener, MouseListener {

    JLabel label;
    Color oldColor;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();

        label.setBounds(0, 0, 250, 250);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }

    // most of these methods are self explanatory when they execute.

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You have clicked on the label!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You have pressed on the label");
        oldColor = label.getBackground();
        label.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("you have released your mouse over the label");
        label.setBackground(oldColor);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse entered over the label!");
        label.setBackground(Color.orange);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse have exited!");
        label.setBackground(Color.red);
    }

}
