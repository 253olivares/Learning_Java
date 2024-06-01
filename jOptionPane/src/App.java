import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // JOptionPane = pop up standard dialog box that propts users for a value
        // or informs them of something

        // The different type of Jpane a user can call
        // JOptionPane.showMessageDialog(null, "This is a test!", "Title",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is a test!", "Title",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is a test!", "Title",
        // JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is a test!", "Title",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is a test!", "Title",
        // JOptionPane.ERROR_MESSAGE);

        // confirmation dialog box
        System.out.println(JOptionPane.showConfirmDialog(null, "Please confirm your order!", "title",
                JOptionPane.YES_NO_CANCEL_OPTION));

        String name = JOptionPane.showInputDialog("What is your name?: ");

        System.out.println(name);

        // we can further customize a dialog box using a show option dialog
        // for example this will let us change our icon and the button option messages!

        // to change the button messages
        // String[] name = {'Option1','Option2','Option3'}

        JOptionPane.showOptionDialog(null, "name", "name", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, null, 0);

    }
}
