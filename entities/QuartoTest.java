package com.example.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuartoTest {
	private Quarto quarto;

	@BeforeEach
	void setUp() {
		//Arrange
		quarto = new Quarto(1L, "Suite", "734");
	}
	@Test
	@DisplayName("Testando Getter e Setter do Id")
	void testId() {
		quarto.setId(2L);
		//Assert
		assertEquals(2L,quarto.getId());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Tipo")
	void testTipo() {
		quarto.setTipo("Guilherme");
		//Assert
		assertEquals("Guilherme",quarto.getTipo());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Numero")
	void testNumero() {
		quarto.setNumero("Guilherme@gmail.com");
		//Assert
		assertEquals("Guilherme@gmail.com",quarto.getNumero());
	}
	
	@Test
	@DisplayName("Testando todos os argumentos")
	void testConstrutor() {
		//Act
		Quarto novoQuarto = new Quarto(3L, "Suite", "734");
		//Assert
		assertAll("novoQuarto",
				()-> assertEquals(3L,quarto.getId()),
				()-> assertEquals("Suite",quarto.getTipo()),
				()-> assertEquals("734",quarto.getNumero()));
	}
}
