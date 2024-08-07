package com.kadukitesesi.kadufood.infrastructure.repository.spec;

import java.math.BigDecimal;

import com.kadukitesesi.kadufood.domain.model.Restaurante;
import org.springframework.data.jpa.domain.Specification;

public class RestauranteSpecs {

	public static Specification<Restaurante> comFreteGratis() {
		return (root, query, builder) -> 
			builder.equal(root.get("taxaFrete"), BigDecimal.ZERO);
	}
	
	public static Specification<Restaurante> comNomeSemelhante(String nome) {
		return (root, query, builder) ->
			builder.like(root.get("nome"), "%" + nome + "%");
	}
	
}
