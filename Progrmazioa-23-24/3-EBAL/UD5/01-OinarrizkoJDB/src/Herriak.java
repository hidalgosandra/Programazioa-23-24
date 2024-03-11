import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Herriak {

    private String server = "localhost";
    private String db = "HerrienDBa";
    private String taula = "Herriak";

    String user = "ikaslea";
    String pass = "ikaslea";

    public Herriak() {
    }

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
}