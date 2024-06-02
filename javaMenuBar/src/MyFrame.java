import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    // setting images for our items
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        // we can also set images to our items
        // loadIcon = new ImageIcon("load.png");
        // saveIcon = new ImageIcon("save.png");
        // exitIcon = new exitIcon("exit.png");

        // create a menu bar for our application
        menuBar = new JMenuBar();

        // create our menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        // create our items from our menus
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // we can also set keyboard shortcuts
        // this also works we menus but its usually recommend for the items only
        // for menu items it will require to hold the alt key
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_Q);

        // set Icons for items
        // loadItem.setIcon(loadIcon);
        // saveItem.setIcon(saveIcon);
        // exitItem.setIcon(exitIcon);

        // add a action listener whenever our menu item is slected
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // add our items to our menu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // add out menus to our bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // set the menu bar to our application
        // at first nothing will show untill we add menus to navigate too;
        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == loadItem) {
            System.out.println("We are loading a file!");
        } else if (e.getSource() == saveItem) {
            System.out.println("We are saving an Item!");
        } else if (e.getSource() == exitItem) {
            System.out.println("Good Bye");
            // close program
            System.exit(0);
        }

    }
}
