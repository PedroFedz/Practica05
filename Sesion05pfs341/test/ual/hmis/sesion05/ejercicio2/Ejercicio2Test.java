package ual.hmis.sesion05.ejercicio2;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Ejercicio2Test {
	
	@Test
	@Order(1)
	public void testEmpty(){
		
		Ejercicio2 ej2 = new Ejercicio2();
		
		assertEquals(false, ej2.login("", "Alberto"));
		assertEquals(false, ej2.login("Alberto", ""));
		
	}
	
	@ParameterizedTest (name = "{index} => se prueba el usuario ({0}) con contraseña ({1})")
	@CsvSource({
	    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,Alberto,false",
	    "Alberto,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false"
	})
	@Order(2)
	public void testLength(String name, String password, Boolean esperado){
		
		Ejercicio2 ej2 = new Ejercicio2();
		String longString =  "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		
		assertEquals(esperado, ej2.login(name, password));
	}
	
	
	
	@ParameterizedTest (name = "{index} => se prueba el usuario ({0}) con contraseña ({1})")
	@CsvSource({
	    "Alberto,Garcia,false",
	    "Alberto,pass,false",
	    "user,Garcia,false",
	    "user,pass,true"
	})
	@Order(3)
	public void testVerificarion(String name, String password, Boolean esperado){
		
		Ejercicio2 ej2 = new Ejercicio2();
	
		assertEquals(esperado, ej2.login(name, password));
	}
	
}
