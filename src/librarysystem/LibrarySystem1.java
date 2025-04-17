package LibrarySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LibrarySystem1 {

    private final String jdbcDriver = "com.mysql.jdbc.Driver";
    private final String dbURL = "jdbc:mysql://localhost:3306/library_system";
    private final String user = "root";
    private final String pass = "";
    
    private Connection con; 
    private Statement stmt;

    public static void main(String[] args) {
        LibrarySystem1 librarysystem1 = new LibrarySystem1();
        librarysystem1.koneksi();
    }

    public void koneksi() {
        try {
            Class.forName(jdbcDriver);
            System.out.println("Driver berhasil dimuat");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ditemukan");
            return;
        }
         
        try {
            con = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Koneksi berhasil");
        } catch (SQLException ex) {
            System.out.println("Koneksi gagal: " + ex.getMessage());
        }
    }
}
