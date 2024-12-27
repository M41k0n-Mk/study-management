package me.m41k0n.study_management.controller;

import me.m41k0n.study_management.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/start")
    public void startTask(@RequestBody String taskId) {
        taskService.startTask(taskId);
    }

    @PostMapping("/stop")
    public void stopTask(@RequestBody String taskId) {
        taskService.stopTask(taskId);
    }

    @PostMapping("/register")
    public void registerTask(@RequestBody String taskId) {
        taskService.registerTask(taskId);
    }

    @PostMapping("/reset")
    public void resetTask(@RequestBody String taskId) {
        taskService.resetTask(taskId);
    }

    @GetMapping("/time/{taskId}")
    public LocalTime getTime(@PathVariable String taskId) {
        return taskService.getTime(taskId);
    }

    @GetMapping("/totalTime/{taskId}")
    public long getTotalTimeInSeconds(@PathVariable String taskId) {
        return taskService.getTotalTimeInSeconds(taskId);
    }
}