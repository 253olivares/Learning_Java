public class MyRunable implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable thread #1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Runnable thread number 1 is finished!");
    }

}
