package com.example.UserManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
public class UserManagementApplication {

	public static void main(String[] args) {
		//Testing
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
