package com.kadukitesesi.kadufood.domain.repository;

import java.util.List;

import com.kadukitesesi.kadufood.domain.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao,Long> {
	
}
