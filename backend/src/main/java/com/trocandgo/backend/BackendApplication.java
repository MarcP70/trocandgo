package com.trocandgo.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.trocandgo.backend.model.Legume;
import com.trocandgo.backend.repository.LegumeRepository;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner init(LegumeRepository repo) {
		return args -> {
			if (repo.count() == 0) {
				repo.save(new Legume("Carotte"));
				repo.save(new Legume("Tomate"));
				repo.save(new Legume("Poivron"));
			}
		};
	}
}
