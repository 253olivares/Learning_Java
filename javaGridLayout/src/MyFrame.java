import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        // bu default as mentioned before the layoutmanager is set to boarder so
        // components are set to take up as much space as possible
        // For this practice we are going to mess with creating grids
        // additionally when creating our grids we can set the gaps between each element
        this.setLayout(new GridLayout(3, 3, 0, 0));

        // if we have a od layout for our grid layout JFrame will create addition rows and columns to make the 

        // JButton button1 = new JButton("1");

        // this.add(button1);

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));

        this.setVisible(true);
    }

}
