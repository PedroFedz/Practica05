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

import ual.hmis.sesion05.ejercicio5.Ejercicio5;


public class Ejercicio5test {
		
	@Test
	@Order(1)
	public void obtenerOrdenadas() {
		List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 3, 8));		
		List<Integer> array2 = new ArrayList<>(Arrays.asList(2, 5, 7));
		
		List<Integer> esperado = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 8));
		
		assertEquals(esperado , Ejercicio5.ordenar(array1, array2));
	}
	
	
	
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
	 public void testOrdenadas(String cadena1, String cadena2) {
	
		 List<Double> array1 = this.ordenarLista(cadena1);
		 List<Double> array2 = this.ordenarLista(cadena2);
		 List<Double> esperado = new ArrayList<>();
		 
		 
		 if(array1.size()==0) {
			 esperado = array2;
		 } else if(array2.size()==0) {
			 esperado = array1;
		 }else {
			 esperado.addAll(array2);
			 esperado.addAll(array1);
			 esperado.sort(null);
		 }
	
		 
		 assertEquals(esperado , Ejercicio5.ordenar(array1, array2));
	 }	
}
