package ual.hmis.sesion05.ejercicio4;

import java.util.Iterator;

public class Ejercicio4 {
	
	
	public static int[][] obtenerDiagonales(int[][] matriz) {
	    int n = matriz.length;
	    int[][] diagonales = new int[2][n];

	    for (int i = 0; i < n; i++) {
	        diagonales[0][i] = matriz[i][i];
	    }
	    for (int i = 0; i < n; i++) {
	        diagonales[1][i] = matriz[n - 1 - i][i];
	    }

	    return diagonales;
	}

	
	
	public static double [] sumarColumnas(double [][] matriz) {
		double [] result = new double[matriz.length];
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i] += matriz[j][i];
			}
		}
		
		return result;
	}

}
