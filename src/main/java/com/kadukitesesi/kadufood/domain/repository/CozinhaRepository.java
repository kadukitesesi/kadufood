package com.kadukitesesi.kadufood.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.kadukitesesi.kadufood.domain.model.Cozinha;

@Component
public interface CozinhaRepository extends JpaRepository<Cozinha,Long> {

	List<Cozinha> findByNomeContaining(String nome);
	
}
