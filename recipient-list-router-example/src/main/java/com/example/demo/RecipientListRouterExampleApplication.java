package com.example.demo;

import com.example.demo.model.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipientListRouterExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RecipientListRouterExampleApplication.class, args);
	}

	@Autowired
	private LocationService locationService;

	@Override
	public void run(String... args) throws Exception {
		locationService.saveLocation("123", "Customer 1");
		locationService.saveLocation("456", "Customer 2");
	}
}