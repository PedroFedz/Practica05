package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
	
	
	public static  <T extends Comparable<T>> List<T> ordenar(List<T> lista1, List<T> lista2){
		List<T> result = new ArrayList<T>();
		result.addAll(lista1);
		result.addAll(lista2);
		result.sort(null);
		return result;
	}

}
