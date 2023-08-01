package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
  
   
    private static String usuario = "";
    private static String senha = "";
    private static String host = "";
    private static String porta = "";
    private static String bd = "";

    
    
    public static Connection obtemConexao() throws Exception {
        try {
          //código de conexao
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
