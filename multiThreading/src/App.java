public class App {
    public static void main(String[] args) throws Exception {

        // Multithreading = process of executing multiple threads simultaneously
        // helps maximize utilization of cpu
        // threads are independent, they dont affect the execution of other threads
        // an exception in on thread will not interrupt other threads
        // useful for serving multiple clients, multiplayer games, or other mutually
        // independent tasks

        // create a subclass of thread;

        // first way of creating a thread
        MyThread thread1 = new MyThread();

        // create our class with the close u want to run
        MyRunable myRunable1 = new MyRunable();

        // then create a thread instance with the runnable within
        Thread thread2 = new Thread(myRunable1);

        // if either one of these threads run into any issues the other thread will
        // continue to run
        thread1.start();
        // this will wait till thread 1 finishes to start thread 2
        thread1.join();
        // we can pass a integer of how much time we want to code to wait before
        // starting our next thread
        // wait 1 seconds before starting the next line of code
        // thread1.join(1000)
        thread2.start();

        // join method
        // we can use join to execute code that depends on waiting on another code to
        // finish

        // if we set one of the threads to a daemon thread then our program will close
        // before our threads are finished

    }
}
