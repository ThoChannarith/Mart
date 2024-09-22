package mart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static final String url = "jdbc:postgresql://localhost:5432/A_to_Z_Mart";
    private static final String user = "postgres";
    private static final String password = "rithxboy";
    
    // Method to establish the connection
    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
    
    
}


    


