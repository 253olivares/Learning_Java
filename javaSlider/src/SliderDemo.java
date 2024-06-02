import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class SliderDemo extends JPanel implements ChangeListener {

    JLabel label;
    JSlider slider;

    SliderDemo() {

        label = new JLabel();
        // When creating a slider we set the min and max values
        // and starting point
        slider = new JSlider(0, 10, 0);

        // customize our slider
        slider.setPreferredSize(new Dimension(400, 200));

        // Add notches yo our slider letting the user known the values
        // to select from
        slider.setPaintTicks(true);

        // set our ranges for the ticks
        // for our slider we do our ranges from 1
        slider.setMinorTickSpacing(1);

        // create larger ticks
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(2);

        // add labels to our major ticks
        slider.setPaintLabels(true);
        // this will be done automatically based on the information provided previously

        // change the font of our ticks
        slider.setFont(new Font("MV Bolid", Font.PLAIN, 15));

        // to check the slider to vertical we set its orientation
        slider.setOrientation(SwingConstants.VERTICAL);

        // now ig we want to get our vlaue for our slider and display the information
        // we write to our label

        // and call the get value
        // assuming we set up our state change to update our value when it changes we
        // should be able to update the value
        label.setText("User Score: " + slider.getValue());

        slider.addChangeListener(this);

        this.setBackground(Color.red);

        // add our slider and label to our JPanel which is the object itself
        this.add(slider);
        this.add(label);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        label.setText("User Score: " + slider.getValue());
    }

}
