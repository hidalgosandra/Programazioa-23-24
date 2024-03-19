package dambat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Herriak {

    private String server = "localhost";
    private String db = "HerrienDBa";
    private String taula = "Herriak";

    String user = "ikaslea";
    String pass = "ikaslea";

    public Herriak() {
    }

    // Konektatu DatuBasera
    public Connection konektatu() {
        String url = "jdbc:mariadb://" + server + "/" + db;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);
            // System.out.println(server + " zerbidoreko " + db + " datu-basera konektatu
            // zara.");
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
        }
        return conn;
    }

    // Irakurri datu bat
    public void irakurriDatuBakarra() {
        String sql = "SELECT COUNT(*) AS Kopurua FROM " + taula;
        // try-with-resources (closes all the resources when try finishes)
        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            System.out.println("Erregistro kopurua: " + rs.getString(1));// edo rs.getString("Kopurua")
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Datu asko irakurri
    public void irakurriDatuAnitzak() {
        String eremua = "Herria";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.println(eremua);
            System.out.println("=====================================");
            ResultSet rs = pstmt.executeQuery();
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString(eremua));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> irakurriItzuliDatuak() {
        String taula = "Herriak";
        String eremua = "Herria";
        String sql = "SELECT * FROM " + taula;
        List<String> lsHerriak = new ArrayList<String>();
        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                lsHerriak.add(rs.getString(eremua));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            return lsHerriak;
        }

    }

    // Insert into bat egin
    public void txertatu(String izenBerria) {
        String eremua = "Herria";
        String sql = "INSERT INTO " + taula + "(" + eremua + ") VALUES(?)";
        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, izenBerria);
            pstmt.executeUpdate();
            System.out.println(izenBerria + " ondo txertatu da.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Update bat egin
    public void aldatu(String izenZaharra, String izenBerria) {
        String eremua = "Herria";
        String sql = "UPDATE " + taula + " SET " + eremua + "= ? WHERE " + eremua + " = ?";
        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, izenBerria);
            pstmt.setString(2, izenZaharra);
            pstmt.executeUpdate();
            System.out.println(izenZaharra + " izena, " + izenBerria + " izenagatik aldatu da");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete bat egin
    public void ezabatu(String izena) {
        String eremua = "Herria";
        String sql = "DELETE FROM " + taula + " WHERE " + eremua + " = ?";
        try (Connection conn = konektatu();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, izena);
            pstmt.executeUpdate();
            System.out.println("Erregistroa ezabatu da.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}