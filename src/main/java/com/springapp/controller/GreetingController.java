package com.springapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.model.Greeting;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greetings")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/greetings/1/{name}")
	public Greeting greetings(@PathVariable("name")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
