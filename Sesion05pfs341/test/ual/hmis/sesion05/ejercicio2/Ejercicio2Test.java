package ual.hmis.sesion05.ejercicio2;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import ual.hmis.sesion05.Ejercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Ejercicio2Test {
	
	@Test
	@Order(1)
	public void testEmpty(){
		
		Ejercicio2 ej1 = new Ejercicio2();
		
		assertFalse(ej1.login("", ""));
		assertFalse(ej1.login("Alberto", ""));
		assertFalse(ej1.login("", "Alberto"));
	}
	
	@Test
	@Order(2)
	public void testLength(){
		
		Ejercicio2 ej1 = new Ejercicio2();
		String longString =  "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		
		assertFalse(ej1.login(longString, "Alberto"));
		assertFalse(ej1.login("Alberto", longString));
	}
	
	
	
	@Test
	@Order(2)
	public void testVerificarion(){
		
		Ejercicio2 ej1 = new Ejercicio2();
		
		assertFalse(ej1.login("Alberto", "Garcia"));
		assertFalse(ej1.login("Alberto", "pass"));
		assertFalse(ej1.login("user", "Garcia"));
		
		//Asercion Correcta
		assertTrue(ej1.login("user", "pass"));
	}
	
	
	
	
	
	

}
