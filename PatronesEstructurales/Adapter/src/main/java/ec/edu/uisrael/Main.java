package ec.edu.uisrael;

import ec.edu.uisrael.resorce.PersonResources;

public class Main {
    public static void main(String[] args) {
        PersonResources resource = new PersonResources();
        System.out.println("---------------------------------------------------");
        System.out.println("CONSUME LISTADO DE PERSONAS POR DESDE ARCHIVO XML");
        System.out.println(resource.readPerson("XML"));
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("CONSUME LISTADO DE PERSONAS POR DESDE ARCHIVO CSV");
        System.out.println(resource.readPerson("CSV"));
        System.out.println("---------------------------------------------------");
    }
}