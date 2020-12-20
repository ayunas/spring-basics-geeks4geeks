package com.geeks4geeks.springbasics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	Hello h;

	@Autowired
	iBankRepo bankRepo;

	@GetMapping("/bank")
	public List<Bank> showBankInfo() {
		List<Bank> banks = bankRepo.findAll();
		System.out.println(banks);
		return banks;
	}

	@PostMapping("/bank")
	public Bank addBank(@RequestBody Bank bank) {
		System.out.println(bank);
		return bankRepo.save(bank);
	}

	@GetMapping("/config")
	public String configMe() {
		System.out.println(h);
		return h.toString();
	}


	@GetMapping
	public String sayHello() {
		return "Hello Geeks!";
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public String showName(@RequestBody Hello req) {
		return "Hello User : " + req.getA();
	}

}


