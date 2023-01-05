/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd_concourscuisine;
import java.sql.*;


/**
 *
 * @author veksor
 */
public class RequetageBD {
    ConnexionBD conn;
    public RequetageBD(ConnexionBD conn){
        this.conn = conn;
    }
    public void getConnexion(){
        conn.getConnexion();
    }
    public void insererRecette(String nom, String prenom, String adresse, String email, String telephone, String recette){
        String requete = "INSERT INTO recettes (nom, prenom, adresse, email, telephone, recette) VALUES ('"+nom+"', '"+prenom+"', '"+adresse+"', '"+email+"', '"+telephone+"', '"+recette+"')";
        conn.getConnexion();
    }
}
