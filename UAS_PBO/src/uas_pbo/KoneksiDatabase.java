
package uas_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/sistem_pemesanan_tiket";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Eror Membuat Koneksi"  + e.getMessage());
                return null;
            }
        }
        return koneksi;
    }
}
