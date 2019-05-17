package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Programa {

    public static void main(String[] args) throws SQLException {
        Connection c = ConnectionFactory.getConnection();
        if (c != null) {
            PreparedStatement ps = c.prepareStatement("select * from tabela");
        }
    }

}
