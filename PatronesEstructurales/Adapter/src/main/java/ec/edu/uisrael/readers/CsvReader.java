package ec.edu.uisrael.readers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvReader {
    public String reader( String fileName ) {
        ClassLoader classLoader = CsvReader.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
            if (inputStream == null) {
                System.out.println("Archivo personas.csv no encontrado en resources");
                return null;
            }

            // Leer el archivo CSV
            CSVReader csvReader = new CSVReader(new InputStreamReader(inputStream));

            List<Map<String, String>> personasList = new ArrayList<>();
            String[] headers = csvReader.readNext();  // Leer la primera fila como cabecera

            String[] line;
            while ((line = csvReader.readNext()) != null) {
                Map<String, String> personaMap = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    personaMap.put(headers[i], line[i]);
                }
                personasList.add(personaMap);
            }

            // Convertir la lista de mapas a JSON
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personasList);

            return json;

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return null;
    }
}
