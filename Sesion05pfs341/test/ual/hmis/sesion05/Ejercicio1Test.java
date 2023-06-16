package ual.hmis.sesion05;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class Ejercicio1Test {
	
	@ParameterizedTest (name = "{index} => transformamos el ({0}) a ({1})")
	@CsvSource({"8, 1", 
		"128, 1"})
	@Order(1)
	public void testCondicion1(int numero, int resultado){
		
		Ejercicio1 ej1 = new Ejercicio1();
		
		//Asertion a pair number
		assertEquals(resultado, ej1.transformar(numero));
	}
	
	
	@ParameterizedTest (name = "{index} => transformamos el ({0}) a ({1})")
	@CsvSource({"125, 1",
		"75, 1",
		"40, 1"})
	@Order(2)
	public void testCondicion2(int numero, int resultado){
		Ejercicio1 ej1 = new Ejercicio1();
		
		assertEquals(resultado, ej1.transformar(numero));
	}
	
	
	@ParameterizedTest (name = "{index} => transformamos el ({0}) a ({1})")
	@CsvSource({"9, 1",
		"36, 1",
		"12, 1"})
	@Order(3)
	public void testCondicion3(int numero, int resultado){
		Ejercicio1 ej1 = new Ejercicio1();
		
		assertEquals(resultado, ej1.transformar(numero));
	}
	
	
	
	@ParameterizedTest (name = "{index} => transformamos el ({0}) a ({1})")
	@CsvSource({"103, 103",
		"149, 149"})
	@Order(4)
	public void testPrimeNumber(int numero, int resultado){
		Ejercicio1 ej1 = new Ejercicio1();
		
		assertEquals(resultado, ej1.transformar(numero));
	}
	
}
