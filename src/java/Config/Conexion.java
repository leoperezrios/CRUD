package Config;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LEONEL
 */
public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbescuela", "postgres", "1234");
        } catch (Exception e) {
            System.out.println("Error de registro de Driver" + e);
        }
    }

    public Connection getConnection() {
        return con;
    }

}

        