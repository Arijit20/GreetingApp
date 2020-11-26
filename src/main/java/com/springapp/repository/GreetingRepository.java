package com.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.model.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}