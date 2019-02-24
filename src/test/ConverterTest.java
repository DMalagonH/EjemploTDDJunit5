package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Converter;

class ConverterTest {

	@DisplayName("No deberia retornar null")
	@Test
	void test() {
		String result = Converter.numeroATexto(1);
		
		// Asegurar que no retorne null
		assertNotEquals(null, result);
	}
		
	@DisplayName("Debería convertir un numero entero a su representación en texto")
	@ParameterizedTest(name = "dado = {0}, esperado = \"{1}\"")
	@CsvSource({ "1, uno", "2, dos", "3, tres", "4, cuatro", "5, cinco" })
	void testConverter(int numero, String textoEsperado) throws Exception {
		assertEquals(textoEsperado, Converter.numeroATexto(numero));
	}
	

	@DisplayName("Deberia retornar null para números mayores a 10")
	@Test
	void error() {
		assertEquals(null, Converter.numeroATexto(11));
		assertEquals(null, Converter.numeroATexto(20));
		assertEquals(null, Converter.numeroATexto(100));
	}
}
