package org.example;

import org.example.models.Video;
import org.example.respositories.AuthorRespository;
import org.example.respositories.VideoRepository;
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
		AuthorRespository authorRepo,
		VideoRepository videoRepo
	){
		return args -> {
			// var author = AuthorModel.builder()
			// 	.firstName("John")
			// 	.lastName("Doe")
			// 	.email("john@email.com")
			// 	.age(25)
			// 	.build();
			// authorRepo.save(author);

			var video = Video.builder()
				.name("Video 1")
				.length(10)
				.build();
			videoRepo.save(video);
		};

	}
}
