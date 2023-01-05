/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd_concourscuisine;
import java.sql.*;

/**
 *
 *  @author veksor
 *
 */
public class ConnexionBD {

    private static Connection conn = null;
    public ConnexionBD() throws ExceptionBD {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            System.out.println("Driver O.K.");
            String url = "jdbc:hsqldb:hsql://localhost/MaBdd";
            String user = "SA";
            String passwd = "";
            conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver non trouvé");
            //throw new ExceptionBD("Classe JDBC non trouvée");
        } catch (SQLException ex) {
            System.out.println("Connexion impossible");
            //throw new ExceptionBD("Connexion à la base de données échouée ("+ex.getMessage()+")");
        }
    }

    public Connection getConnexion()  {
        return conn;
    }
    public void deconnecter() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erreur de déconnexion");
        }
    }
}
