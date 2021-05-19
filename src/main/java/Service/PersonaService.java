
package Service;

import Clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PersonaService implements PersonaServiceInterface{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona(1,"Pablo","Patiño","pablo@hotmail.com","232323"));
        personas.add(new Persona(2,"23","4","pablo@5.com","1"));
        return personas;
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        
        return null;
       
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
       
        
       return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        
    }

    @Override
    public void modificarPersona(Persona persona) {
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        
    }
    
}
