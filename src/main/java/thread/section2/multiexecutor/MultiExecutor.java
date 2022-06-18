package main.java.thread.section2.multiexecutor;

import java.util.List;

public class MultiExecutor {
    // Add any necessary member variables here

    /*
     * @param tasks to executed concurrently
     */
    List<Runnable> tasks ;
    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        for (Runnable task : this.tasks) {
            new Thread(task).start();
        }
    }
}

