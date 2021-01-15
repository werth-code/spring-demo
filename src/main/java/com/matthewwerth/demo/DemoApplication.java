package com.matthewwerth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController 		// Allows this class to serve REST endpoints.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping       // Allows us to GET this data from the URI specified. This function is auto called when we visit.
	public List<String> hello() {
		return List.of("Hello Matt!", "How Are You?");
	}

}
