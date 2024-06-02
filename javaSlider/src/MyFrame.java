
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    SliderDemo demo;

    MyFrame() {
        this.setTitle("Slider Demo");

        demo = new SliderDemo();

        this.add(demo);

        this.setSize(420, 420);
        this.setVisible(true);
    }

}
