import java.security.PublicKey;

public class MyThread extends Thread {
    // one method of creating a thread us putting our code we want to mulitthread
    // inside a run method
    // and call it
    //
    @Override
    public void run() {
        //
        System.out.println("this thread is running!");

        // we can check inside the class if a thread is a daemon or user thread
        if (this.isDaemon()) {
            System.out.println("This is a Daemon thread");
        } else {
            System.out.println("This is a user thread!");
        }
    }

}
