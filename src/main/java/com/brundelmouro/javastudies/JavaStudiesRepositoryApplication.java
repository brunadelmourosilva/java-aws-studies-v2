package com.brundelmouro.javastudies;

import com.brundelmouro.javastudies.features.stream.StreamTest03PraticeMediumExercises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStudiesRepositoryApplication implements CommandLineRunner {

	@Autowired
	StreamTest03PraticeMediumExercises exercises;

	public static void main(String[] args) {
		SpringApplication.run(JavaStudiesRepositoryApplication.class, args);
	}

	@Override
	public void run(final String... args) throws Exception {
		//exercise 1
		//exercises.exerciseOne();

		//exercise 2
		exercises.exerciseTwo();
	}
}
