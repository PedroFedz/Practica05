package ual.hmis.sesion05.coches;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	String ruta = "data/coches.json";
    	
    	Coche[] coches = JsonReader.leerCochesJSON(ruta);
    	
    	// Imprimir los objetos del arreglo
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}

