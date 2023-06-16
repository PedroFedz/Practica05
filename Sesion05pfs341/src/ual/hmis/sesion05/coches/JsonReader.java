package ual.hmis.sesion05.coches;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReader {

	/**
	 * Lectura de un archivo JSON a partir del url de un archivo de tipo json
	 * @param archivo ruta del archivo a leer
	 * @return Array del objeto coche 
	 * @throws IOException
	 */
	public static Coche[] leerCochesJSON (String archivo) throws IOException {
		
		Coche[] coches = null;
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();

        try (FileReader reader = new FileReader(archivo)) {
            // Parsear el archivo JSON en un objeto de la clase JsonObject
            JsonObject jsonObject = parser.parse(reader).getAsJsonObject();

            // Obtener el arreglo de objetos "coches"
            JsonArray cochesJson = jsonObject.getAsJsonArray("coches");

            // Crear un arreglo de la clase Coche y llenarlo con los objetos del archivo JSON
            coches = gson.fromJson(cochesJson, Coche[].class);

            
        } catch (FileNotFoundException e) {
            
        } 
        return coches;
        
	}
}
