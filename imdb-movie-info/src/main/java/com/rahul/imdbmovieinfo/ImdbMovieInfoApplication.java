package com.rahul.imdbmovieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ImdbMovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbMovieInfoApplication.class, args);
	}

}
