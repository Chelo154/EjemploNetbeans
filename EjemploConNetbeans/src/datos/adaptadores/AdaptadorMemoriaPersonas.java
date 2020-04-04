/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.adaptadores;
import dominio.Persona;
import java.util.ArrayList;
import datos.interfaces.IPersistenciaPersonas;
/**
 *
 * @author Chelo
 */
public class AdaptadorMemoriaPersonas implements IPersistenciaPersonas   {
    private ArrayList<Persona> personas;
    
    public AdaptadorMemoriaPersonas(){
        personas = new ArrayList<>();
    }
    @Override
    public  void agregarPersona(Persona nuevo) {
        personas.add(nuevo);
    }

    @Override
    public ArrayList<Persona> obtenerPersonas() {
        return personas;
    }

    @Override
    public Persona buscarPersona(int dni) {
        for(Persona p : personas){
          if(p.getDni() == dni) return p;  
        
    }
        return null;
    }
  
}
