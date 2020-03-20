package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio01.Circulo;

class CirculoTest {
	
	Circulo circulo;
	
	@BeforeEach
	void preparacao () {
		
		circulo = new Circulo (7);
	}
	
	@Test
	void test_calcular_area() {
		double resultado = circulo.area();
		assertEquals (153.93804002589985, resultado, 0.001);
		
	}
	
	@Test
	void test_calcular_perimetro() {
		double resultado = circulo.perimetro();
		assertEquals (52, resultado);
	}
	
	@AfterEach
	void limpando() {
		
		circulo = null;
	}

}
