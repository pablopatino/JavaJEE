
package Service;

import Clases.Persona;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PersonaServiceInterface {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersona(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
