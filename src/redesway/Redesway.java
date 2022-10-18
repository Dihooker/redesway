/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesway;

/**
 *
 * @author Dirk Hooker
 */
public class Redesway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       conexion conectado = new conexion();
       cliente Cliente = new cliente();
       conectado.getconexion();
       Cliente.setVisible(true);
       
       
      
    }
    
}
