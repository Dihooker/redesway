package redesway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class conexion {
    Connection con;
    //Conexion a la base de datos
    public Connection getconexion(){
        try{
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/redesway","root","");
            System.out.println("Conexion establecida de forma satisfactoria");
            return con;
        } catch (SQLException e) {
            System.out.println(e);
           JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos");
            return null;
        }
        
    }
}
    
            

