package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Programa {
    public static void main(String[] args)  {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root" , "1234");
            PreparedStatement ps = c.prepareStatement("select * from tabela");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
