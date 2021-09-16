package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes;

import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain.Pix;
import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.service.GestaoTransacoesService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SbGtbdBaseAtomGestaoTransacoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbGtbdBaseAtomGestaoTransacoesApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(GestaoTransacoesService pGestaoTransacoesService) {
		return args -> {

			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Pix>> typeReference = new TypeReference<List<Pix>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("json/pix.json");

			try {
				List<Pix> transacaoPix = mapper.readValue(inputStream, typeReference);
				pGestaoTransacoesService.save((Pix) transacaoPix);
				System.out.println("Pix salvo!");

			} catch (IOException e) {
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

;
}
