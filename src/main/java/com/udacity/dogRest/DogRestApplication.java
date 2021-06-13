package com.udacity.dogRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogRestApplication.class, args);
	}

}
