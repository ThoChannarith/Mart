package mart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static final String url = "jdbc:postgresql://localhost:5432/A_to_Z_Mart";
    private static final String user = "postgres";
    private static final String password = "rithxboy";
    
    // Method to establish the connection
    public Connection connect() {
        Connection connection = null;
        try {
            // Attempt to establish a connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to PostgreSQL established!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }
    
    public static void main(String[] args) {
        ConnectionDatabase db = new ConnectionDatabase();
        Connection connection = db.connect();

        // Do database operations here

        
    }
}


    


