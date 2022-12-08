package com.example.university;

import com.example.university.controller.StudentController;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.university.repository")


@SpringBootApplication
@ComponentScan(basePackageClasses = StudentController.class)
public class UniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

}
