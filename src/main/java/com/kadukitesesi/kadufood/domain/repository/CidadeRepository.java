package com.kadukitesesi.kadufood.domain.repository;

import java.util.List;

import com.kadukitesesi.kadufood.domain.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {
	
}
