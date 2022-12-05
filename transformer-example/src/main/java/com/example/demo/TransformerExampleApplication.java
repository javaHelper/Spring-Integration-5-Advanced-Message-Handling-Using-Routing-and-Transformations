package com.example.demo;

import com.example.demo.model.FamilyReservation;
import com.example.demo.service.FamilyReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransformerExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TransformerExampleApplication.class, args);
	}

	@Autowired
	private FamilyReservationService familyReservationService;

	@Override
	public void run(String... args) throws Exception {
		FamilyReservation familyReservation = new FamilyReservation(
				1, "Smith", "Deluxe", 2);
		familyReservationService.bookFamilyReservation(familyReservation);
	}
}