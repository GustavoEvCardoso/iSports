package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
  
   
    private static String usuario = "";
    private static String senha = "";
    private static String host = "";
    private static String porta = "";
    private static String bd = "SPT_ESPORTES";

    
    
    public static Connection obtemConexao() throws Exception {
        try {
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC",
                usuario,
                senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
