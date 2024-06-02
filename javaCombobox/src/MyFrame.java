import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // this is our selection box
        // we use a combo box and as we create it we need to provide an array
        // of the values we want to include within

        // Special note: when adding vlaues we need to make sure we add wrapper classes
        String[] animals = { "dog", "cat", "bird" };

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // combobox has some additional methods that can come in handy
        // set editiable lets us change the label text to one of the options
        comboBox.setEditable(true);

        // get item count allows us to see how many items ar within our array
        System.out.println(comboBox.getItemCount());

        // add Item allows us to add an item to the area to extend our drop down
        comboBox.addItem("Chicken");

        // we can also insert based on index
        comboBox.insertItemAt("Pig", 0);

        // we can choose which index to begin at when the component loads
        comboBox.setSelectedIndex(0);

        // we can let our combo box known we want to remove an item by specifying the
        // string
        comboBox.removeItem("Pig");

        // we can also remove basedcd on index
        comboBox.removeItemAt(0);

        // and if we wantwe can just clear everything
        comboBox.removeAll();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == comboBox) {
            // calling our combo box and requesting its item gets our value back
            System.out.println(comboBox.getSelectedItem());
            // otherwise we can request its index to get the value we choose index number in
            // the array
            System.out.println(comboBox.getSelectedIndex());
        }

    }
}
