package main.java.thread.basics;

/*

 */

public class RunThread {

    public static void main (String [] args)  {
        Thread thread = new NewThread();
        thread.start();
    }
    private static class NewThread extends Thread {
        @Override
        public void run (){
            System.out.println("Current thread priority is " + this.getName());
        }
    }
}
