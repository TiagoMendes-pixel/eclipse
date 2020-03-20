package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio01.Quadrado;

class QuadradoTest {
	Quadrado quadrado;
	
	@BeforeEach
	void preparação () {
		
		quadrado = new Quadrado (8, 0);
		
		
	}
	
	@Test
	void test_calcular_area() {
		assertEquals (5, 5);
	}
	
	@Test
	void test_calcular_perimetro() {
		double resultado = quadrado.perimetro();
		 assertEquals (16, resultado);
	}
	

}
