package guiIntro.src;

import javax.swing.JOptionPane;

// introduction to Gui
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name!");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age!"));
        JOptionPane.showMessageDialog(null, "You are " + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height!"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall!");
    }
}
