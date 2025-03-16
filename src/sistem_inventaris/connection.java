/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_inventaris;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HUSAIN
 */

public class connection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/sistem_inventaris";
        String username = "root";
        String password = ""; // ganti dengan password Anda

        return DriverManager.getConnection(url, username, password);
    }
}
