package Main;

import Clases.Persona;
import Service.PersonaServiceInterface;
import java.util.List;
import javax.naming.*;

public class Test {
    
    public static void main(String[] args) {
        System.out.println("Inicializacion del programa");
   
        try {
            Context con = new InitialContext();
            PersonaServiceInterface pi = (PersonaServiceInterface) con.lookup("java:global/JEE-JPA/PersonaService!Service.PersonaServiceInterface");
            
            List<Persona> personas = pi.listarPersonas();
            
            System.out.println("Prueba");
            
            personas.forEach( p -> {
                System.out.println("Persona: " + p);
            } );
            

        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
