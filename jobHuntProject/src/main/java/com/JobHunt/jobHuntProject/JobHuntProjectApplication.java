package com.JobHunt.jobHuntProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JobHuntProjectApplication {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    String encoded = encoder.encode("test123");
	    System.out.println("Encoded: " + encoded);
	    System.out.println("Verify: " + encoder.matches("test123", encoded));
		SpringApplication.run(JobHuntProjectApplication.class, args);
	}

}
