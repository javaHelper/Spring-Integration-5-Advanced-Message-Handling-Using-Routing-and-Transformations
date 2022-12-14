package com.example.demo;

import com.example.demo.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeaderValueRouterExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HeaderValueRouterExampleApplication.class, args);
	}

	@Autowired
	private SupportService supportService;

	@Override
	public void run(String... args) throws Exception {
		supportService.openTicket("ABC Company", "high", "Problem doing something");
		supportService.openTicket("XYZ Company", "low", "Problem doing something else");
	}
}