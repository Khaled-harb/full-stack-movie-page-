package net.talaatharb.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesBackendApplication.class, args);
		System.out.println("all done");
	}

}
