package com.supriya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.supriya")

public class ProblemSolvingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemSolvingApplication.class, args);
	}

}




