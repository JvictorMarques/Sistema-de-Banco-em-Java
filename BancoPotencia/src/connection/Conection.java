
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conection {
    Connection con;
    public Conection() {
        try {
            Class.forName("com.mysql..jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_potencia", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Nao foi possivel estabelecer a conexao com o banco de dados. Erro"+e);
        }
    }
    public Connection getConnection() {
        return con;
    }
}
