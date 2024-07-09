package com.kadukitesesi.kadufood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kadukitesesi.kadufood.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class KadufoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(KadufoodApplication.class, args);
	}

}
