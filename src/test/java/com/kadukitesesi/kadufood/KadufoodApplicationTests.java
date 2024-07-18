package com.kadukitesesi.kadufood;

import com.kadukitesesi.kadufood.domain.exception.CozinhaNaoEncontradaException;
import com.kadukitesesi.kadufood.domain.exception.EntidadeEmUsoException;
import com.kadukitesesi.kadufood.domain.model.Cozinha;
import com.kadukitesesi.kadufood.domain.service.CadastroCozinhaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import io.res
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KadufoodApplicationTests {

	@Autowired
	CadastroCozinhaService cadastroCozinhaService;

	@Test(expected = EntidadeEmUsoException.class)
	public void deveFalhar_QuandoExcluirCozinhaEmUso() {
		Cozinha cozinha = new Cozinha();

		cadastroCozinhaService.excluir(1L);

	}

	@Test(expected = CozinhaNaoEncontradaException.class)
	public void deveFalhar_QuandoExcluirCozinhaInexistente() {

		cadastroCozinhaService.excluir(9L);
	}

	@LocalServerPort
	private int port;

	@Test
	public void deveRetornarStatus200_QuandoConsultarCozinhas() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

		RestDocsRestAssuredConfigurationCustomizergiven()
				.basePath("/cozinhas")
				.port(port)
				.accept(ContentType.JSON)
				.when()
				.get()
				.then()
				.statusCode(HttpStatus.OK.value());
	}

}
