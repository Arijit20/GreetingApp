package com.springapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.model.Greeting;
import com.springapp.model.User;
import com.springapp.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		User user = new User();
		user.setfName(name);
		return greetingService.addGreeting(user);
	}
	
	
	@PostMapping("/post")
	public Greeting greeting(@RequestBody User user) {
		return greetingService.addGreeting(user);
	}
}


