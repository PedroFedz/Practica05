package ual.hmis.sesion05;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class Ejercicio1Test {
	
	@Test
	@Order(1)
	public void testCondicion1(){
		
		Ejercicio1 ej1 = new Ejercicio1();
		
		//Asertion a pair number
		assertEquals(1, ej1.transformar(8));
	}
	
	
	@Test
	@Order(2)
	public void testCondicion2(){
		Ejercicio1 ej1 = new Ejercicio1();
		
		assertEquals(1, ej1.transformar(125));
	}
	
	
	@Test
	@Order(3)
	public void testCondicion3(){
		Ejercicio1 ej1 = new Ejercicio1();
		
		assertEquals(1, ej1.transformar(27));
	}
	
	

	@Test
	@Order(3)
	public void testPrimeNumber(){
		Ejercicio1 ej1 = new Ejercicio1();
		
		assertEquals(31, ej1.transformar(31));
	}
	
}
