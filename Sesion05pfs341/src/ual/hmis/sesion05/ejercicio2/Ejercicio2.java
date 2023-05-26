package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login (String username, String password){
		
		boolean min = false;
		boolean may = false;
		boolean num = false;
		// comprobar que sean distintos de vacio
		if(username.isEmpty() || password.isEmpty()) return false;
		// comprobar que la longitud sea < 30
		if(username.length()>=30 || password.length()>=30 ) return false;
		
//		// comprobar password con letra mayuscula, una minuecula y un digito
//		for (char  letra : password.toCharArray()) {
//			if(Character.isLowerCase(letra)) min = true;
//			
//			if(Character.isUpperCase(letra)) may = true;
//			
//			if(Character.isDigit(letra)) num = true;
//		}
//		
//		if(min == false || may == false || num == false) return false;
		
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}
	
	public boolean compruebaLoginEnBD(String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("pass"))
			return true;
		else
			return false;
	}

}