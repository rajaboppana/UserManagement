package com.example.UserManageent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
public class UserManagentApplication {

	public static void main(String[] args) {
		//Testing
		SpringApplication.run(UserManagentApplication.class, args);
	}

}
