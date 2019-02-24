package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Converter;

class ConverterTest {

	@DisplayName("No deberia retornar null")
	@Test
	void test() {
		String result = Converter.numeroATexto(1);
		
		// Asegurar que no retorne null
		assertNotEquals(null, result);
	}
	
}
