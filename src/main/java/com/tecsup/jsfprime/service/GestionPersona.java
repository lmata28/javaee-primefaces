package com.tecsup.jsfprime.service;

import com.tecsup.jsfprime.model.Role;
import com.tecsup.jsfprime.model.Persona;
import java.util.ArrayList;
import java.util.List;

public class GestionPersona {

    public List<Role> listar() {
        List<Role> roles = new ArrayList();

        roles.add(new Role(1l, "Administrador"));
        roles.add(new Role(2l, "Supervisor"));
        roles.add(new Role(3l, "Terapeuta"));
        

        return roles;
    }

    public List<Persona> listarPorRole(Long id) {

        List<Persona> personas = new ArrayList();
        personas.add(new Persona(1l, "Guilliver", "Beltran", "001"));
        personas.add(new Persona(2l, "Lulu", "Aven", "002"));
        personas.add(new Persona(3l, "Luisa", "Divertido", "003"));
        personas.add(new Persona(4l, "Tom", "Lim", "004"));
        personas.add(new Persona(5l, "Ana", "Kathe", "005"));
        personas.add(new Persona(6l, "Tiburcio", "Limaita", "006"));
        personas.add(new Persona(7l, "Gatuvela", "Nino", "007"));
        personas.add(new Persona(8l, "Lucas", "Costelo", "008"));
        personas.add(new Persona(9l, "Javier", "Buitron", "009"));
        
        List<Persona> respuesta = new ArrayList();
        switch (id.intValue()) {
            case 1:
                respuesta = personas.subList(0, 3);
                break;
            case 2:
                respuesta = personas.subList(3, 6);
                break;
            case 3:
                respuesta = personas.subList(6, 9);
                break;
            case 4:
                respuesta = personas.subList(9, 11);
                break;    
            case 0:
                respuesta = personas;
        }
        return respuesta;
    }

}
