package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Converter;

class ConverterTest {

	@DisplayName("No deberia retornar una cadena vacia")
	@Test
	void test() {
		String result = Converter.numeroATexto(1);
		
		// No retorne una cadena vacia
		assertNotEquals("", result);
	}

}
