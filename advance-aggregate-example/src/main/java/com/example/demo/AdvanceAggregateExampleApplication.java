package com.example.demo;

import com.example.demo.model.GroupReservation;
import com.example.demo.model.PartyReservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvanceAggregateExampleApplication implements CommandLineRunner {
	@Autowired
	private ReservationService reservationService;


	public static void main(String[] args) {
		SpringApplication.run(AdvanceAggregateExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		GroupReservation groupReservation = new GroupReservation("123");
		groupReservation.getParties().add(new PartyReservation(1, "Double", "Smith"));
		groupReservation.getParties().add(new PartyReservation(2, "Single", "Jones"));
		reservationService.bookGroupReservation(groupReservation, 4);

		GroupReservation groupReservation2 = new GroupReservation("123");
		groupReservation2.getParties().add(new PartyReservation(3, "Double", "Johnson"));
		groupReservation2.getParties().add(new PartyReservation(4, "Single", "Fitzpatrick"));
		reservationService.bookGroupReservation(groupReservation2, 4);
	}
}