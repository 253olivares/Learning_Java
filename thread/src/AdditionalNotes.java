public class AdditionalNotes {
    public static void main(String[] args) {
        // Java Threads
        // Threads allows a program to operate more efficiently
        // this is done by doing mulitple things at the same time

        // threads can be used to perform complicated tasks in the background without
        // interupting the main program

        // creating a thread
        // there are 2 ways to create a thread
        // first s to extend the thread class and overrun its run method

        class Main2 extends Thread {
            public void run() {
                System.out.println("this is thread");
            }
        }

        // Another way is to implement the runnable interace
        class Main3 implements Runnable {
            public void run() {
                System.out.println("this is also running in a thread");
            }
        }

        // running threads
        // if the class extends the thread class the thread can be run by creating an
        // instance of the class and call the start method
        Main2 newMan = new Main2();
        // start our thread
        newMan.start();

        // If the class implements the runnable interface, the thread can be run by
        // passing an instance of the class to a thread objects constructor and then
        // calling the threads start method
        Main3 obj = new Main3();
        Thread thread = new Thread(obj);
        thread.start();

        // The major difference is that when a class extends the thread class, you
        // cannot extend any other class, but by implementing the runnable interface, it
        // is possible to extends from another class as well, like: Class MyClass
        // extends OtherClass implements Runnable

        // Concurrency Problems
        // Becuase threads run at the same time as other parts of the program, there is
        // no way to know in which other the code will run. When the threads and main
        // program are reading and writing the same variables, the values are
        // unpredictable. The problems that result from this are called concurrency
        // problems.

        // To avoid this issue it is best to avoid sharing attributes between threads
        // of attributes need to be shared a possible solution is to use the isAlive()
        // method of the thread to check if the thread has finished running before using
        // any attributes that the thread can change
    }
}
