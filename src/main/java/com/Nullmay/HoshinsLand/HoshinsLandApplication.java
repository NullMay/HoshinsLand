package com.Nullmay.HoshinsLand;


import com.Nullmay.HoshinsLand.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HoshinsLandApplication {

	@Autowired
	private UserRepo repository;

	public static void main(String[] args) {
		SpringApplication.run(HoshinsLandApplication.class, args);
	}
}
