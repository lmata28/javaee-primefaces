package com.tecsup.jsfprime.bean;


import com.tecsup.jsfprime.model.Persona;
import com.tecsup.jsfprime.model.Role;
import com.tecsup.jsfprime.service.GestionPersona;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RoleBean {
    
    private List<Role> roles;
    private List<Persona> personas;
    private Persona personaSeleccionada;

   
    public RoleBean() {
        GestionPersona gestion = new GestionPersona();
        this.roles = gestion.listar();
        this.personas = gestion.listarPorRole(1l);
        
        System.out.println("TOTAL Role  " + this.personas.size());
    }
    
    public void cargarPersonas(Long role) {
        GestionPersona gestion = new GestionPersona();
        this.personas = gestion.listarPorRole(role);
        
        System.out.println("TOTAL PERSONA  " + this.personas.size());
    }

    public List<Role> getRoles() {
        return roles;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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
