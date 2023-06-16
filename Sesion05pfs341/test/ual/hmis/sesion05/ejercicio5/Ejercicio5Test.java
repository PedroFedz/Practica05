package ual.hmis.sesion05.ejercicio5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class Ejercicio5Test {
		
	private List<Double> ordenarLista(String cadena){
		List<Double> ar = new ArrayList<Double>();
		if(cadena == null) return ar;
		String [] arr = cadena.split(" ");
		for (String num : arr) 
			ar.add(Double.parseDouble(num));
		
		return ar;
	}
	
	 @ParameterizedTest
	 @CsvFileSource(resources = "datos.csv")
	 public void testOrdenadas(String cadena1, String cadena2, String cadenaEsp) {
		 Ejercicio5 ej5 = new Ejercicio5();
	
		 List<Double> array1 = this.ordenarLista(cadena1);
		 List<Double> array2 = this.ordenarLista(cadena2);
		 List<Double> esperado = this.ordenarLista(cadenaEsp);
		 
		 assertEquals(esperado , ej5.ordenar(array1, array2));
	 }	
}
