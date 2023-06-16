package ual.hmis.sesion05.coches;


import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class JsonReaderTest {
	
	private String ruta = "data/coches.json";
	
	@ParameterizedTest
	@CsvFileSource(resources = "datosJSONDiferente.csv")
	void testCochesDiferentesCsv(String marca1, String modelo1, String anio1, String precio1) throws IOException {
		Coche primero = new Coche (marca1, modelo1, Integer.parseInt(anio1), Integer.parseInt(precio1));
		Coche [] coches = JsonReader.leerCochesJSON(ruta);

		assertFalse (primero.equals(coches[0]));
		assertFalse (coches[0].equals(primero));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "FakeUrls.csv")
	void testCochesError(String url) {
		JsonReader js = new JsonReader();
		try {
			JsonReader.leerCochesJSON("data/cochesError.json");
		} catch (IOException e) {

		}
	}
	
	


}
