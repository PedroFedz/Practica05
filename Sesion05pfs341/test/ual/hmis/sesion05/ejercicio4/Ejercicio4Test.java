package ual.hmis.sesion05.ejercicio4;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import ual.hmis.sesion05.Ejercicio1;
import ual.hmis.sesion05.ejercicio2.Ejercicio2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;

public class Ejercicio4Test {
	
	
	@Test
	@Order(1)
	public void obtenerDiagonales() {
		Ejercicio4 ej1 = new Ejercicio4();
		int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] diagonales = ej1.obtenerDiagonales(matriz);

	        int[][] expectedDiagonales = {
	            {1, 5, 9},
	            {7, 5, 3}
	        };

	        assertArrayEquals(expectedDiagonales, diagonales);
	}
	
	
	@Test
	@Order(2)
	public void tesstSumarColumnas() {
		double[][] matriz = {
			    {3.5, 8.0, 4.5},
			    {2.0, 4, 7.0},
			    {5.0, 3.0, 4.5}
			};

	        double[] esperado = {10.5, 15.0, 16.0};
	        
	        assertArrayEquals(esperado, Ejercicio4.sumarColumnas(matriz), 0.01);
	 }
	
	
	 @ParameterizedTest
	 @CsvFileSource(resources = "datos.csv")
	 public void testCsvDiagonales(String matriz) {
		 String[] lineas = matriz.split(";");
		    int[][] result = new int[lineas.length][lineas.length];

		    for (int i = 0; i < lineas.length; i++) {
		        String[] linea = lineas[i].trim().split(" ");
		        for (int j = 0; j < linea.length; j++) {
		            result[i][j] = Integer.parseInt(linea[j].trim());
		        }
		    }
		    
		    int[][] esperado = {{1,4}, {3, 2}};
		    
		    assertArrayEquals(esperado, Ejercicio4.obtenerDiagonales(result));
	 }	

}
