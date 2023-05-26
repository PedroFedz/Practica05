package ual.hmis.sesion05.ejercicio3;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import ual.hmis.sesion05.Ejercicio1;
import ual.hmis.sesion05.ejercicio2.Ejercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;


public class Ejercicio3Test {
	
	

	@Test
	@Order(1)
	public void testOutOfRange(){
		Ejercicio3 ej1 = new Ejercicio3();
		String esperadoC = "password demasiado corto";
		String esperadoL = "password demasiado largo";
		
		assertEquals(esperadoC, ej1.enmascarado("pass"));
		assertEquals(esperadoL, ej1.enmascarado("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	
	}
	
	@Test
	@Order(2)
	public void testInRange(){
		Ejercicio3 ej1 = new Ejercicio3();
		
		assertEquals("********", ej1.enmascarado("pfs34"));
		assertEquals("************", ej1.enmascarado("Contraseña larga"));
	
	}
	
	
	 @ParameterizedTest
	 @CsvFileSource(resources = "datos.csv")
	 public void testAllEjercicio3(String password) {
		 Ejercicio3 ej1 = new Ejercicio3();
		 String esperado;
		 if(password.length() < 5) esperado = "password demasiado corto";
		 else if(password.length() > 40) esperado =  "password demasiado largo";
		 else if(password.length()>= 5 && password.length() <= 8) esperado = "********";
		 else esperado =  "************";
		 
		 assertEquals(esperado, ej1.enmascarado(password));
	 }	
		
}
