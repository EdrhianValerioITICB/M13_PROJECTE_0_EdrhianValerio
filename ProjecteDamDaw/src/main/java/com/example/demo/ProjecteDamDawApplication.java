package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.example.demo.repository")
@EntityScan("com.example.demo.model")
@SpringBootApplication
public class ProjecteDamDawApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjecteDamDawApplication.class, args);
	}
}
