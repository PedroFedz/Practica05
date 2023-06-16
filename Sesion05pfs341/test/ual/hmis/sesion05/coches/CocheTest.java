package ual.hmis.sesion05.coches;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CocheTest {
	
	
	
	@Test
	void testMain() throws IOException {
		Main m = new Main();
		Main.main(null);
	}

	@Test
	void testEqualsObject() {
		Coche c = new Coche ();   // Arrange
		assertTrue(c.equals(c));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectNull() {
		Coche c = new Coche ();   // Arrange
		Coche c2 = null;
		assertFalse(c.equals(c2));  // Action // Assert
	}
	
	
	@Test
	void testEqualsObjectString() {
		Coche c = new Coche ();   // Arrange
		String c2 = "";
		assertFalse(c.equals(c2));  // Action // Assert
	}
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,Toyota,Corolla,2022,22000,true",
	    "Toyota,Auris,2022,22000,Toyota,Auris,2022,22000,true",
	    "Toyota,Corolla,2022,22000,Toyota,Corolla,2023,22000,false",
	    "Toyota,Auris,2022,22000,Toyota,Auris,2023,22000,false",
	    "Toyota,Corolla,2022,22000,Alpha,Corolla,2022,22000,false",
	    "Toyota,Auris,2022,22000,Nisan,Auris,2022,22000,false",
	    "Toyota,Corolla,2022,22000,Toyota,Auris,2022,22000,false",
	    "Toyota,Auris,2022,22000,Toyota,Enzo,2022,22000,false",
	    "Toyota,Corolla,2022,22000,Toyota,Corolla,2022,12000,false",
	    "Toyota,Auris,2022,22000,Toyota,Auris,2022,32000,false",
	})
	void testTotal(String marca1, String modelo1, String anio1, String precio1, String marca2, String modelo2, String anio2, String precio2, boolean esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		Coche segundo = new Coche (marca2, modelo2, Integer.parseInt(anio2), Integer.parseInt(precio2));
		assertEquals(esperado, primero.equals(segundo));
	}
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,Toyota,Corolla,2022,22000,true",
	    "Toyota,Auris,2022,22000,Toyota,Auris,2022,22000,true",
	    "Toyota,Corolla,2022,22000,Toyota,Corolla,2023,22000,false",
	    "Toyota,Auris,2022,22000,Toyota,Auris,2023,22000,false",
	    "Toyota,Corolla,2022,22000,Alpha,Corolla,2022,22000,false",
	    "Toyota,Auris,2022,22000,Nisan,Auris,2022,22000,false",
	    "Toyota,Corolla,2022,22000,Toyota,Auris,2022,22000,false",
	    "Toyota,Auris,2022,22000,Toyota,Enzo,2022,22000,false",
	    "Toyota,Corolla,2022,22000,Toyota,Corolla,2022,12000,false",
	    "Toyota,Auris,2022,22000,Toyota,Auris,2022,32000,false",
	})
	void testToString(String marca1, String modelo1, String anio1, String precio1, String marca2, String modelo2, String anio2, String precio2, boolean esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		Coche segundo = new Coche (marca2, modelo2, Integer.parseInt(anio2), Integer.parseInt(precio2));
		
		assertEquals(esperado, primero.toString().equals(segundo.toString()));
	}
	
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,Corolla"
	})
	void testGetterModelo(String marca1, String modelo1, String anio1, String precio1, String esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		
		assertEquals(esperado, primero.getModelo());
	}
	
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,2022"
	})
	void testGetterAnio(String marca1, String modelo1, String anio1, String precio1, int esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		
		assertEquals(esperado, primero.getAño());
	}
	
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,22000"
	})
	void testGetterPrecio(String marca1, String modelo1, String anio1, String precio1, int esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		
		assertEquals(esperado, primero.getPrecio());
	}
	
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,Toyota"
	})
	void testGetterMarca(String marca1, String modelo1, String anio1, String precio1, String esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		
		assertEquals(esperado, primero.getMarca());
	}
	

	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,Alpha"
	})
	void testSetterMarca(String marca1, String modelo1, String anio1, String precio1, String esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		primero.setMarca(esperado);
		assertEquals(esperado, primero.getMarca());
	}
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,Yaris"
	})
	void testSetterModelo(String marca1, String modelo1, String anio1, String precio1, String esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		primero.setModelo(esperado);
		assertEquals(esperado, primero.getModelo());
	}
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,2011"
	})
	void testSetterAño(String marca1, String modelo1, String anio1, String precio1, int esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		primero.setAño(esperado);
		assertEquals(esperado, primero.getAño());
	}
	
	
	@ParameterizedTest
	@CsvSource({
	    "Toyota,Corolla,2022,22000,2011"
	})
	void testSetterPrecio(String marca1, String modelo1, String anio1, String precio1, int esperado) {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		primero.setPrecio(esperado);
		assertEquals(esperado, primero.getPrecio());
	}

}
