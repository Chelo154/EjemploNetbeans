/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.interfaces;
import dominio.Persona;
import java.util.ArrayList;
/**
 *
 * @author Chelo
 */
public interface IPersistenciaPersonas {
    public  void agregarPersona(Persona nuevo);
    public  ArrayList<Persona> obtenerPersonas();
    public Persona buscarPersona(int dni);
}
