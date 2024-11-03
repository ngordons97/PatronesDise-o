package ec.edu.uisrael.resorce;

import com.sun.source.tree.ReturnTree;
import ec.edu.uisrael.readers.CsvReader;
import ec.edu.uisrael.readers.XmlReader;

public class PersonResources {
    public PersonResources() {
    }
    public String readPerson(String type){
        String data=null;
        switch (type){
            case "XML":
                XmlReader xmlReader = new XmlReader();
                data= xmlReader.reader("personas.xml");
                break;
            case "CSV":
                CsvReader csvReader = new CsvReader();
                data= csvReader.reader("personas.csv");
                break;
            default:
                data = "Formato no definido";
        }
        return data;
    }
}
