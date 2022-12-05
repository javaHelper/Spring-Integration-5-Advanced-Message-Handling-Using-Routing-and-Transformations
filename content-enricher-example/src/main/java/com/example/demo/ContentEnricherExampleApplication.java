package com.example.demo;

import com.example.demo.model.PartyReservation;
import com.example.demo.service.SwagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContentEnricherExampleApplication implements CommandLineRunner {

	@Autowired
	private SwagService swagService;

	@Override
	public void run(String... args) throws Exception {
		PartyReservation partyReservation = new PartyReservation(1, "Deluxe", "Smith");
		swagService.sendSwag(partyReservation);
	}

	public static void main(String[] args) {
		SpringApplication.run(ContentEnricherExampleApplication.class, args);
	}
}