package org.example.Classes;

public class Stopwatch {
    private boolean isRunning;
    private long startTime;
    private long endTime;
    private long duration;

    public void start() throws Exception {
        if (isRunning) {
            throw new Exception("Stopwatch is already running");
        } else {
            isRunning = true;
            startTime = System.currentTimeMillis();
            System.out.println("Stopwatch is now running");
        }
    }

    public void stop() throws Exception {
        if (isRunning) {
            isRunning = false;
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Stopwatch is now stopped. Duration was: " + duration);
        } else {
            throw new Exception("Stopwatch is already stopped");
        }
    }

    public void getDuration() throws Exception {
        if (isRunning) {
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Current duration is: " + duration);
        } else {
            throw new Exception("Stopwatch is not running");
        }
    }

}
