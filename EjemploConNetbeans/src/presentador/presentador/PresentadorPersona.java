/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador.presentador;

/**
 *
 * @author Chelo
 */
import presentador.interfaces.IGestionarPersonas;
import dominio.*;
import datos.interfaces.IPersistenciaPersonas;
import datos.GestorPersistencias;
import java.util.ArrayList;



public class PresentadorPersona {
    /*Atributos*/
    private IGestionarPersonas vista;
    /*Constructor*/
    public PresentadorPersona(IGestionarPersonas vista){
        this.vista = vista;
    }
    
    /*Metodos*/
    public void agregarPersona(int dni, String nombre, String apellido){
        IPersistenciaPersonas persistencia;
        ArrayList<Persona> personas= null;        
        try{
           Persona nuevo = new Persona(dni,nombre,apellido);
           persistencia = GestorPersistencias.obtenerAccesoPersistencia();
           persistencia.agregarPersona(nuevo);
           personas = persistencia.obtenerPersonas();
           vista.notificarPersonaAgregada();
        }catch(Exception e1){
            vista.notificarExcepcion(e1);
            
        }finally{            
            vista.listarPersonas(personas);
        }
        
    }
    public void obtenerPersonas(){
        IPersistenciaPersonas persistencia = GestorPersistencias.obtenerAccesoPersistencia();
        vista.listarPersonas(persistencia.obtenerPersonas());
    }
}
