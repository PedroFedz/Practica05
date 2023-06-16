package ual.hmis.sesion05.ejercicio4;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.Ejercicio1;
import ual.hmis.sesion05.ejercicio2.Ejercicio2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.MethodOrderer;

public class Ejercicio4Test {
	

	@ParameterizedTest
	@CsvSource({
	    "1 2;3 4, 1 4;3 2;"
	})
	public void tesstCsvDiagonales(String matriz, String matrizEsperada) {
		
		 String[] lineas = matriz.split(";");
		 String[] lineasE = matrizEsperada.split(";");
		    int[][] result = new int[lineas.length][lineas.length];
		    int[][] esperada = new int[lineasE.length][lineasE.length];
		    
		    
		    for (int i = 0; i < lineas.length; i++) {
		        String[] linea = lineas[i].trim().split(" ");
		        String[] lineaE = lineasE[i].trim().split(" ");
		        for (int j = 0; j < linea.length; j++) {
		            result[i][j] = Integer.parseInt(linea[j].trim());
		            esperada[i][j] = Integer.parseInt(lineaE[j].trim());
		        }
		    }
		    assertArrayEquals(esperada, Ejercicio4.obtenerDiagonales(result));
	 }
	
	

	@ParameterizedTest
	@CsvSource({
	    "1 2;3 4, 4 6"
	})
	public void tesstSumarColumnas(String matriz, String arrayEsperado) {
		Ejercicio4 ej4 = new Ejercicio4();
		String[] lineasE = arrayEsperado.split(" ");
		double suma [] = new double[lineasE.length]; 
		
		for(int i = 0; i < lineasE.length;i++) {
			suma[i] = Double.parseDouble(lineasE[i]);
		}
		
		String[] lineas = matriz.split(";");
		
		    double[][] result = new double[lineas.length][lineas.length];	    
		    
		    for (int i = 0; i < lineas.length; i++) {
		        String[] linea = lineas[i].trim().split(" ");
		        for (int j = 0; j < linea.length; j++) {
		            result[i][j] = Integer.parseInt(linea[j].trim());
		        }
		    }
		    
		    assertArrayEquals(suma, ej4.sumarColumnas(result), 0.01);
		
	}
	

}
