package com.geeks4geeks.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Value("${test.prop}")
	private String geeks;

	@Autowired
	iBankRepo bankRepo;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("Hello Geeks 4 Geeks Spring Boot App!");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(geeks);

		List<Bank> banks = bankRepo.findAll();
		banks.forEach(b -> System.out.println(b));
	}

}
