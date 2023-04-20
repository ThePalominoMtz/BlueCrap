package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexionconsqllite {

    String strConexionDB = "jdbc:sqlite:P:/Proyectos/Edrey/CangrejoAzul.s3db";
    Connection conn = null;
 
    public conexionconsqllite() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion establecida uwu");
        } catch (Exception e) {
            System.out.println("Error de conexion unu" + e);
        }

    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

    //Yair del futuro, este metodo es para devolver informacion
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            //Esta parte de aqui es para saber si la informacion existe o si no existe
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static Connection getConexion() { //Nueva linea de codigo
        String url = "jdbc:sqlite:P:/Proyectos/Edrey/CangrejoAzul.s3db";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public void GuardarDatos() { //Metodo que manda a llamar al procedimiento almacenado
        String query = "exec GuardarDatos";
    }

    public void ModificarDatos() { //Metodo que manda a llamar al procedimiento almacenado
        String query = "exec ModificarDatos";
    }

    public void EliminarDatos() { //Metodo que manda a llamar al procedimiento almacenado
        String query = "exec EliminarDatos";
    }

    public void SumarDatos() {
        String query = "exec SumarDatos"; //se inserto esta linea 
    }

}
