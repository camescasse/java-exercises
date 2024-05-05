package org.example;

import org.example.Classes.Stopwatch;

public class Main {
    public static void main(String[] args) throws Exception {
        var stopwatch = new Stopwatch();
        stopwatch.start();
        Thread.sleep(1000);
        stopwatch.currentTime();
        Thread.sleep(200);
        stopwatch.stop();
    }
}