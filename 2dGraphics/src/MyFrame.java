import javax.swing.JFrame;
import java.awt.Panel;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new Panel());

        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
