package com.application.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.application.todo.repo")
@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		System.out.println("Todo Application Started");
		SpringApplication.run(TodoListApplication.class, args);
	}

}
