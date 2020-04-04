/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador.interfaces;

import dominio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Chelo
 */
public interface IGestionarPersonas {
    public void listarPersonas(ArrayList<Persona> personas);
    public void notificarPersonaAgregada();
    public void notificarExcepcion(Exception e);
}
