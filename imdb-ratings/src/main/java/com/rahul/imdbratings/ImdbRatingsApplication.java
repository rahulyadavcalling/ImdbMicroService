package com.rahul.imdbratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImdbRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbRatingsApplication.class, args);
	}

}
