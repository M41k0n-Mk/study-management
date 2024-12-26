package me.m41k0n.study_management.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Stopwatch {
    private LocalTime time;
    private final Timer timer;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Stopwatch() {
        time = LocalTime.of(0, 0, 0);
        timer = new Timer();
    }

    public void start() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time = time.plusSeconds(1);
                System.out.println(time.format(formatter));
            }
        }, 0, 1000);
    }

    public void stop() {
        timer.cancel();
    }

    public void reset() {
        stop();
        time = LocalTime.of(0, 0, 0);
    }
}