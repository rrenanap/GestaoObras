package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static ConexaoBD instancia;
    private static final String URL = "jdbc:mysql://localhost:3306/obras";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private ConexaoBD() {}

    public static ConexaoBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
