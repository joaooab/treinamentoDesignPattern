package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionFactory {
    static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/banco", "root" , "1234");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
