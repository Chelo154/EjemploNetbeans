/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Chelo
 */
import datos.adaptadores.*;
import datos.interfaces.IPersistenciaPersonas;
public class GestorPersistencias {
    private static AdaptadorMemoriaPersonas persistencia = new AdaptadorMemoriaPersonas();
   
    public static  IPersistenciaPersonas obtenerAccesoPersistencia(){
        return persistencia;
    }
}
