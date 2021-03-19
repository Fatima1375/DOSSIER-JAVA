package sn.isi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    //pour la connexion
    private Connection cnx;
    //pour les resultats des requetes de type SELECT
    private ResultSet rs;
    //pour les requetes preparees
    private PreparedStatement pstm;
    //pour les resultats des requetes de type MISE A JOUR(INSERT , UPDATE, DELETE)
    private int ok;

    private void getConnection(){
        String url = "jdbc:mysql://localhost:3306/stock";
        String user = "root";
        String password = "";
        try {
            //charger la classe qui gere les pilotes pour ouvrir une connexion a une base de
            //donnees JAVA en utilisant:
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user, password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //fonction qui permet d'initialiser les requetes sql
    public  void initPrepar(String sql){
        //gerer les exceptions avec try catch
        try {
            getConnection();
            //on prepare la requete pour effectuer une liaison entre les tables
            //et la requete
            pstm = cnx.prepareStatement(sql);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    //Execution des requetes de type SELECT
    public ResultSet executeSelect(){
        //rs = null;
        try {
            rs = pstm.executeQuery();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return rs;
    }

    //Execution des requetes de type MAJ (UPDATE)
    public int executeMaj(){
        try {
            ok = pstm.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    //Fonction qui permet de liberer les ressources (fermer la connexion a la base
    public void closeConnection(){
        try {
            if(cnx != null){
                cnx.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public PreparedStatement getPstm() {
        return pstm;
    }
}
