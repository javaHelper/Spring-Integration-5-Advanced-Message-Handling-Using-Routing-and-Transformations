package com.example.demo;

import com.example.demo.model.PurchaseOrder;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericRouterExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GenericRouterExampleApplication.class, args);
	}

	@Autowired
	private PaymentService paymentService;

	@Override
	public void run(String... args) throws Exception {
		paymentService.submitPurchaseOrder(new PurchaseOrder("Customer 1", 500f));
		paymentService.submitPurchaseOrder(new PurchaseOrder("Customer 2", 50000f));
	}
}