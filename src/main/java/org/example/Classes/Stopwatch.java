package org.example.Classes;

public class Stopwatch {
    boolean running;
    long startTime;
    long endTime;
    long duration;

    public Stopwatch() {
        this.running = false;
    }

    public void start() throws Exception {
        if (running) {
            throw new Exception("Stopwatch is already running");
        } else {
            running = true;
            startTime = System.currentTimeMillis();
            System.out.println("Stopwatch is now running");
        }
    }

    public void stop() throws Exception {
        if (running) {
            running = false;
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Stopwatch is now stopped. Duration was: " + duration);
        } else
            throw new Exception("Stopwatch is already stopped");
    }

    public void currentTime() throws Exception {
        if (running) {
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Current duration is: " + duration);
        } else throw new Exception("Stopwatch is not running");
    }

}
