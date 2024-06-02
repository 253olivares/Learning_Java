import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    JFileChooser fileChooser;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // create a button
        button = new JButton("Select File");
        button.addActionListener(this);

        // add button
        this.add(button);
        // close window arround element
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println("You have clicked on the buttons");

            // create a file choosen instance
            fileChooser = new JFileChooser();

            // we can change the directory we start at
            // inside the file we apply the file path for where we want
            fileChooser.setCurrentDirectory(new File("."));

            // this allows us to select a file to open
            // for the purpose of this exercise we are just going to get the directory of
            // the file

            int response = fileChooser.showOpenDialog(null);

            // int response = fileChooser.showSaveDialog(null);// allows us to save a file
            // at select directory

            if (response == JFileChooser.APPROVE_OPTION) {
                // if a user chooses a file
                // we get the file path
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                // display our file path
                System.out.println(file);
            }

        }
    }

}
