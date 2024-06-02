import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements ActionListener, KeyListener {

    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        // we do not want a layout since we will be moving our items pixel by pixel
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.black);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // keyTyped = invoked when a key is typed, uses KeyChar, char outpuit
        // System.out.println("you typed the key Char: " + e.getKeyChar());
        // System.out.println("You typed the key code: " + e.getKeyCode());

        switch (e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY() - 5);
                break;
            case 'a':
                label.setLocation(label.getX() - 5, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 5);
                break;
            case 'd':
                label.setLocation(label.getX() + 5, label.getY());
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // keyPressed = invoked when a physical key is pressed down. uses keycode | int
        // output
        // System.out.println("you pressed the key Char: " + e.getKeyChar());
        // System.out.println("You pressed the key code: " + e.getKeyCode());

        switch (e.getKeyCode()) {
            case 38:
                label.setLocation(label.getX(), label.getY() - 5);
                break;
            case 37:
                label.setLocation(label.getX() - 5, label.getY());
                break;
            // doesnt work since it only reads one key at a time and not multiple
            case 38 & 37:
                label.setLocation(label.getX() - 5, label.getY() - 5);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 5);
                break;
            case 39:
                label.setLocation(label.getX() + 5, label.getY());
                break;
            default:
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // keyReleased = called whenever a key is released
        System.out.println("you released the key Char: " + e.getKeyChar());
        System.out.println("You released the key code: " + e.getKeyCode());
    }
}
