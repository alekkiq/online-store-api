package com.example.webstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.webstore.config")
public class WebstoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebstoreApiApplication.class, args);
	}

}
