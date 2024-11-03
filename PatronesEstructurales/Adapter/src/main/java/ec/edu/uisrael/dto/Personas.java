package ec.edu.uisrael.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Personas {
    @JsonProperty("persona")
    public List<Persona> personas;
    public Personas() {}
    public Personas(List<Persona> personas) {
        this.personas = personas;
    }
}
