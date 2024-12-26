package me.m41k0n.study_management;

import me.m41k0n.study_management.utils.Stopwatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyManagementApplication.class, args);
		Stopwatch sw = new Stopwatch();
		sw.start();

	}

}
