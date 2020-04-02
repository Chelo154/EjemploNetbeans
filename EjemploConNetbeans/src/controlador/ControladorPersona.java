/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import vista.VistaPersona;

/**
 *
 * @author Chelo
 */
public class ControladorPersona {
     private static VistaPersona ventana = new VistaPersona();
     public static void iniciar(){
         ventana.setVisible(true);
     }
}
