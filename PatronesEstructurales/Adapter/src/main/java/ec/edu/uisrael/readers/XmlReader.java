package ec.edu.uisrael.readers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ec.edu.uisrael.dto.Persona;
import ec.edu.uisrael.dto.Personas;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XmlReader {
    public String reader(String fileName) {
        ClassLoader classLoader = XmlReader.class.getClassLoader();

        ObjectMapper jsonMapper = new ObjectMapper();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
            if (inputStream == null) {
//                System.out.println("Archivo "+fileName+" no encontrado en resources");
                return null;
            }
            // Crear un factory para construir un DocumentBuilder
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // Parsear el archivo XML
            Document doc = dBuilder.parse(inputStream);
            doc.getDocumentElement().normalize();
            // Obtener la raíz del documento
            Element root = doc.getDocumentElement();
//            System.out.println("Root element :" + root.getNodeName());
            // Obtener todos los elementos con el tag "persona"
            NodeList list = doc.getElementsByTagName("persona");
            List<Persona> personas = new ArrayList<>();
            for (int temp = 0; temp < list.getLength(); temp++) {
                Node nNode = list.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Persona persona = new Persona();
                    Element eElement = (Element) nNode;
//                    System.out.println("Persona id : " + eElement.getElementsByTagName("edad").item(0).getTextContent());
//                    System.out.println("Nombre : " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
//                    System.out.println("Nombre : " + eElement.getElementsByTagName("ciudad").item(0).getTextContent());
                    persona.setEdad(Integer.parseInt(eElement.getElementsByTagName("edad").item(0).getTextContent()));
                    persona.setNombre(eElement.getElementsByTagName("nombre").item(0).getTextContent());
                    persona.setCiudad(eElement.getElementsByTagName("ciudad").item(0).getTextContent());
                    personas.add(persona);
                }
            }
            return jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personas);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}

