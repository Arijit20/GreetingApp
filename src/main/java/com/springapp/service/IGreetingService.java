package com.springapp.service;

import com.springapp.model.Greeting;
import com.springapp.model.User;

public interface IGreetingService {
	
	Greeting addGreeting(User user);
    Greeting getGreetingById(long id);

}
