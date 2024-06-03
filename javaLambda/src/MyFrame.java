import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame() {

        myButton.setBounds(100, 100, 100, 100);
        // myButton.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent e) {
        // // TODO Auto-generated method stub
        // // write our action method
        // }

        // });

        // shortcut for action listener
        myButton.addActionListener((e) -> {
            System.out.println("You clicked a button");
        });

        myButton2.setBounds(200, 100, 100, 100);
        myButton2.addActionListener(e -> {
            System.out.println("Second button clicked!");
        });

        this.add(myButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
