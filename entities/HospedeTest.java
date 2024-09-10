package com.example.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
	private Hospede hospede;

	@BeforeEach
	void setUp() {
		//Arrange
		hospede = new Hospede(1L, "Guilherme", "Guilherme@gmail.com", "(15)99988-8557", "Rua dos Bobos", "Ourinhos", "Washington", "0", "18220-020", "480724538-62" );
	}
	@Test
	@DisplayName("Testando Getter e Setter do Id")
	void testId() {
		hospede.setId(2L);
		//Assert
		assertEquals(2L,hospede.getId());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Nome")
	void testNome() {
		hospede.setNome("Guilherme");
		//Assert
		assertEquals("Guilherme",hospede.getNome());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Email")
	void testEmail() {
		hospede.setEmail("Guilherme@gmail.com");
		//Assert
		assertEquals("Guilherme@gmail.com",hospede.getEmail());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Telefone")
	void testTelefone() {
		hospede.setTelefone("(15)99988-8557");
		//Assert
		assertEquals("(15)99988-8557",hospede.getTelefone());
	}
	@Test
	@DisplayName("Testando Getter e Setter da Rua")
	void testRua() {
		hospede.setRua("Rua dos Bobos");
		//Assert
		assertEquals("Rua dos Bobos",hospede.getRua());
	}
	@Test
	@DisplayName("Testando Getter e Setter da Cidade")
	void testCidade() {
		hospede.setCidade("Ourinhos");
		//Assert
		assertEquals("Ourinhos",hospede.getCidade());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Estado")
	void testEstado() {
		hospede.setEstado("Washington");
		//Assert
		assertEquals("Washington",hospede.getEstado());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Numero")
	void testNumero() {
		hospede.setNumero("0");
		//Assert
		assertEquals("0",hospede.getNumero());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Cep")
	void testCep() {
		hospede.setCep("18220-020");
		//Assert
		assertEquals("18220-020",hospede.getCep());
	}
	@Test
	@DisplayName("Testando Getter e Setter do CPF")
	void testCpf() {
		hospede.setCpf("480724538-62");
		//Assert
		assertEquals("480724538-62",hospede.getCpf());
	}
	@Test
	@DisplayName("Testando todos os argumentos")
	void testConstrutor() {
		//Act
		Hospede novoHospede = new Hospede(3L, "Guilherme", "Guilherme@gmail.com", "(15)99988-8557", "Rua dos Bobos", "Ourinhos", "Washington", "0", "18220-020", "480724538-62");
		//Assert
		assertAll("novoHospede",
				()-> assertEquals(3L,hospede.getId()),
				()-> assertEquals("Guilherme",hospede.getNome()),
				()-> assertEquals("Guilherme@gmail.com",hospede.getEmail()), 
				()-> assertEquals("(15)99988-8557",hospede.getTelefone()),
				()-> assertEquals("Rua dos Bobos",hospede.getRua()),
				()-> assertEquals("Ourinhos",hospede.getCidade()),
				()-> assertEquals("Washington",hospede.getEstado()),
				()-> assertEquals("0",hospede.getNumero()),
				()-> assertEquals("18220-020",hospede.getCep()),
				()-> assertEquals("480724538-62",hospede.getCpf())
				);
		
	}
	
}
