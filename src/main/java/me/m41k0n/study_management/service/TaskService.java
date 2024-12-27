package me.m41k0n.study_management.service;

import me.m41k0n.study_management.utils.Stopwatch;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class TaskService {
    private final Map<String, Stopwatch> stopwatches = new HashMap<>();

    public void startTask(String taskId) {
        Stopwatch stopwatch = stopwatches.getOrDefault(taskId, new Stopwatch());
        stopwatch.start();
        stopwatches.put(taskId, stopwatch);
    }

    public void stopTask(String taskId) {
        Stopwatch stopwatch = stopwatches.get(taskId);
        if (stopwatch != null) {
            stopwatch.stop();
        }
    }

    public void registerTask(String taskId) {
    // TODO: Implement when working on the persistence part of the application. Next sprint
    }

    public void resetTask(String taskId) {
        Stopwatch stopwatch = stopwatches.get(taskId);
        if (stopwatch != null) {
            stopwatch.reset();
        }
    }

    public LocalTime getTime(String taskId) {
        Stopwatch stopwatch = stopwatches.get(taskId);
        return stopwatch != null ? stopwatch.getTime() : LocalTime.of(0, 0, 0);
    }

    public long getTotalTimeInSeconds(String taskId) {
        Stopwatch stopwatch = stopwatches.get(taskId);
        return stopwatch.getTimeInSeconds();
    }
}