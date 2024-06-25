package com.kadukitesesi.kadufood.domain.service;

import com.kadukitesesi.kadufood.domain.exception.EntidadeNaoEncontradaException;
import com.kadukitesesi.kadufood.domain.model.Cozinha;
import com.kadukitesesi.kadufood.domain.model.Restaurante;
import com.kadukitesesi.kadufood.domain.repository.CozinhaRepository;
import com.kadukitesesi.kadufood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(String
						.format("Não existe cadastro de cozinha com código %d", cozinhaId)));

		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.save(restaurante);
	}
	
}
