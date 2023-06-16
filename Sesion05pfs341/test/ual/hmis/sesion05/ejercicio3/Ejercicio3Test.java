package ual.hmis.sesion05.ejercicio3;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import ual.hmis.sesion05.ejercicio3.*;
import org.junit.jupiter.api.MethodOrderer;


public class Ejercicio3Test {
	
	@ParameterizedTest (name = "{index} => se enmascara la contraseña ({0}) y da como resultado ({1})")
	@CsvSource({
	    "pass, password demasiado corto",
	    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, password demasiado largo"
	})
	@Order(1)
	public void testOutOfRange(String password, String esperado){
		Ejercicio3 ej3 = new Ejercicio3();
		
		assertEquals(esperado, ej3.enmascarado(password));
	}
	
	
	
	@ParameterizedTest (name = "{index} => se enmascara la contraseña ({0}) y da como resultado ({1})")
	@CsvSource({
	    "pfs34, ********",
	    "Contraseña larga, ************"
	})
	@Order(2)
	public void testInRange(String password, String esperado){
		Ejercicio3 ej1 = new Ejercicio3();
		
		assertEquals(esperado, ej1.enmascarado(password));
	
	}
	
	
		
}
