package main;

public class Converter {
	
	public static String numeroATexto(int numero) {		
		String result;
	
		if( numero >= 0 && numero <= 10) {
			result = buscarNumero(numero);
		} else {
			result = null;
		}		
		
		return result;
	}
	
	public static String buscarNumero(int numero) {
		String[] lista = getLista();
		String textoNumero;
		
		if (numero < lista.length ) {
			textoNumero = lista[numero];
		} else {
			textoNumero = null;
		}	
		
		return textoNumero;
	}
	
	public static String[] getLista() {
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
		
		return numeros;
	}
}
