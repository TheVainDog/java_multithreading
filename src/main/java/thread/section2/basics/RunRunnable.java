package main.java.thread.section2.basics;

/*


 */
public class RunRunnable {

    public static void main (String [] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });
        thread.setName("New Worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before start a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before start a new thread");

        //Thread.sleep(1000);

    }
}
