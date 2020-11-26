package com.springapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.model.User;

@RestController
public class Apis {
	
	@GetMapping("/first")
	public ResponseEntity<String> getFirstApi(){
		ResponseEntity<String> x = new ResponseEntity<String>("finally it worked !!", HttpStatus.OK);
		return x;
	}
	
	@GetMapping("/second/{name}")
	public ResponseEntity<String> getSecondApi(@PathVariable("name")String name){
		ResponseEntity<String> x = new ResponseEntity<String>("Hello "+ name, HttpStatus.OK);
		return x;
	}
	
	@GetMapping("/third")
	public ResponseEntity<String> getThirdApi(@RequestParam("key")String key){
		ResponseEntity<String> x = new ResponseEntity<String>("welcome "+ key, HttpStatus.OK);
		return x;
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> getFourthApi(@RequestBody User user){
		ResponseEntity<String> x = new ResponseEntity<String>(" "+user.getfName()+ " "+ user.getlName(), HttpStatus.OK);
		return x;
	}

}
