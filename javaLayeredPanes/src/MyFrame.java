import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyFrame extends JFrame {
    MyFrame() {

        JLayeredPane layeredPane = new JLayeredPane();

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        layeredPane.setBounds(0, 0, 500, 500);

        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2, JLayeredPane.MODAL_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        // attache our layered pane to our Frame
        this.add(layeredPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setLayout(null);
        this.setVisible(true);
    }
}
