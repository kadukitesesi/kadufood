package com.kadukitesesi.kadufood.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import com.kadukitesesi.kadufood.domain.model.Restaurante;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository extends CustomJpaRepository<Restaurante,Long>
		, RestauranteRepositoryQueries, JpaSpecificationExecutor<Restaurante> {

	List<Restaurante> findByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);

	List<Restaurante> consultarPorNome(String nome);
}
