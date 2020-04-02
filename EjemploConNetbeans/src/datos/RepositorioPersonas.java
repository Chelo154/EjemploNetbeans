/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.util.ArrayList;
import modelo.*;
/**
 *
 * @author Chelo
 */
public class RepositorioPersonas {
    private static ArrayList<Persona> personas = new ArrayList<>();
    
    public static void agregarPersona(Persona nuevo){
        personas.add(nuevo);
    }
    
    public static ArrayList<Persona>  obtenerPersonas(){
       return personas;   
    }
}
