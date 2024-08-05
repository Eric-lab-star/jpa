package org.example;

import org.example.models.AuthorModel;
import org.example.respositories.AuthorRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRespository authorRepo
	){
		return args -> {
			var author = AuthorModel.builder()
				.firstName("John")
				.lastName("Doe")
				.email("john@email.com")
				.age(25)
				.build();
			authorRepo.save(author);
		};

	}
}
