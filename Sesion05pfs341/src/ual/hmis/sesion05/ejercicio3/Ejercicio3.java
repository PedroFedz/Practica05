package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String enmascarado(String password) {
		
		if(password.length() < 5) return "password demasiado corto";
		
		if(password.length() > 40) return "password demasiado largo";
		
		if(password.length() <= 8) return "********";
		
		return "************";
	}
}
