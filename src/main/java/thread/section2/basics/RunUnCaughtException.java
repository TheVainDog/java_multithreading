package main.java.thread.section2.basics;

public class RunUnCaughtException {
    public static void  main (String args []){
        Thread thread = new Thread(() -> {
            throw  new RuntimeException("Intentional exception");
        });

        thread.setName("Misbehaving thread");
        thread.setUncaughtExceptionHandler( (t, e) -> {
            System.out.println("A critical error happened in thread " + t.getName()
                    + "\nThe error is: " + e.getMessage());
        });
        thread.start();
    }
}
