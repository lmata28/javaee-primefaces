package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PersonaBean {

    private List<Persona> personas;

    private Persona personaSeleccionada;

    public PersonaBean() {
        Persona juan = new Persona(1l,"Juan", "Carlos", "1020");
        Persona jorge = new Persona(2l,"Jorge", "Izuski", "1560");
        Persona felipe = new Persona(3l,"Felipe", "Gruña", "14350");
        Persona luiza = new Persona(4l,"Luiza", "Marcos", "10234");
        Persona carmen = new Persona(5l,"Carmen", "CC", "1340");
        Persona helena = new Persona(6l,"Helena", "Vilma", "1030");

        personas = Arrays.asList(juan, jorge, felipe, luiza, carmen, helena);
    }

    public List<Persona> buscar(String busqueda) {

        List<Persona> encontrados = new ArrayList();
        for (Persona p : personas) {
            String nombre = (p.getApellidos() + " " + p.getNombres()).toLowerCase();
            
            if (nombre.contains(busqueda)) {
                encontrados.add(p);
            }
        }

        return encontrados;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

}
