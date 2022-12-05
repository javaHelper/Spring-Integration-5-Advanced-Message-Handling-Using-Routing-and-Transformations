package com.example.demo;

import com.example.demo.model.GroupReservation;
import com.example.demo.model.PartyReservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitterExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SplitterExampleApplication.class, args);
	}

	@Autowired
	private ReservationService reservationService;

	@Override
	public void run(String... args) throws Exception {
		GroupReservation groupReservation = new GroupReservation("123");
		groupReservation.getParties().add(new PartyReservation(1, "Double", "Smith"));
		groupReservation.getParties().add(new PartyReservation(2, "Single", "Jones"));
		reservationService.bookGroupReservation(groupReservation);
	}
}