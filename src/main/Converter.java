package main;

public class Converter {
	
	public static String numeroATexto(int number) {
		
		String result;
		
		String[] numeros = new String[11];
		numeros[0] = "cero";
		numeros[1] = "uno";
		numeros[2] = "dos";
		numeros[3] = "tres";
		numeros[4] = "cuatro";
		numeros[5] = "cinco";
		numeros[6] = "seis";
		numeros[7] = "siete";
		numeros[8] = "ocho";
		numeros[9] = "nueve";
		numeros[10] = "diez";
	
		if( number >= 0 && number <= 10) {
			result = numeros[number];
		} else {
			result = null;
		}		
		
		return result;
	}
}
