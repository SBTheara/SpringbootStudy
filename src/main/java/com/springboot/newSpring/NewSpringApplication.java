package com.springboot.newSpring;

import com.springboot.newSpring.AppController.AppController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSpringApplication.class, args);
		AppController controller = new AppController();
		System.out.println(controller.Greeting());
	}

}
