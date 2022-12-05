package com.example.demo;

import com.example.demo.model.PartyReservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeaderEnricherExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HeaderEnricherExampleApplication.class, args);
	}

	@Autowired
	private ReservationService reservationService;

	@Override
	public void run(String... args) throws Exception {
		PartyReservation partyReservation = new PartyReservation(1, "Deluxe", "Smith");
		reservationService.bookPartyReservation(partyReservation);
	}
}