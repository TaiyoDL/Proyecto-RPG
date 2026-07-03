import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() throws SQLException{


        return DriverManager.getConnection("jdbc:sqlite:BD/RPG.bd");
    }

    public static Connection conectarBD_Default() throws SQLException{


        return DriverManager.getConnection("jdbc:sqlite:BD/DatosRPG_BASE.bd");
    }
    
}
