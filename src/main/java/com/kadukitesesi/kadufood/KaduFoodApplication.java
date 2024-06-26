package com.kadukitesesi.kadufood;

import com.kadukitesesi.kadufood.domain.repository.infraestructure.CustomJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
@SpringBootApplication
public class KaduFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaduFoodApplication.class, args);
	}

}
