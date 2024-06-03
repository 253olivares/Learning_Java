public class App {
    // this is our main thread
    public static void main(String[] args) throws Exception {
        // thread = a thread of execution in a program (kind of like a virtual CPU)
        // The JVM allows an application to have multiple threads running concurrently
        // each thread can execute parts of your code in parallel with the main thread
        // Each thread has a priority
        // thread with higher priority are executed in preference compared to others
        //
        // the java virtual machine continues to execute threads until either
        // all exit methods of classes runtime has been called
        // all user threads have died

        // when a JVM starts up, there is a thread which calls the main method
        // this thread is called main
        //

        // this will return how many threads are active
        System.out.println(Thread.activeCount());

        // gets the name of our main thread that is currently running
        // this should be named main
        System.out.println(Thread.currentThread().getName());

        // we can also set names for our thread which would help with troubleshooting
        Thread.currentThread().setName("New name!");

        // we can get priority of our threads as well
        System.out.println(Thread.currentThread().getPriority());
        // this gets our current priority of our thread

        // prio go from 1 to 10
        Thread.currentThread().setPriority(10);
        // this would make our thread really important for our code

        // we can also check to see if a thread is alive
        Thread.currentThread().isAlive();
        // will return a boolean value depending on if its alive or not

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            // we can tell our program to sleep or wait using thread.sleep
            Thread.sleep(1000);
        }

        System.out.println("You are done!");

        // we can create multiple threads and are not just limited to one
        MyThread thread2 = new MyThread();

        // run start instead of run
        // run method is only created to tell thread what the code we want it to run is
        // thread2.start();
        // System.out.println(thread2.isAlive());

        System.out.println(thread2.getName());

        // we can also change the name of this thread as a normal thread
        thread2.setName("checkingThread");

        // all methods we used previously on our thread to get its prio and names work
        // with our new custom thread as well
        // one caveat is that threads inherit values from the main thread so any values
        // we set in prio previously is carried onto our new thread
        // so bc we set our original thread to prio of 10
        // this thread will also have a prio of 10
        thread2.getPriority();

        // we have different type of threads as well
        // daemon thread is a low priority thread that runs in the background to perform
        // tasks such a as garbage collection
        // JVM terminates itself when all user thread (non daemon threads) finish their
        // execution

        // we can check to see if our threads or daemon or not
        // will return a boolean
        thread2.isDaemon();

        // we can also set it
        thread2.setDaemon(true);

    }
}
