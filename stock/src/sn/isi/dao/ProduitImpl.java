package sn.isi.dao;

import sn.isi.entities.Produit;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProduitImpl implements IProduit{
    private DB db = new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(Produit p) {
        String sql = "INSERT INTO produit VALUES(?, ?, ?)";
        //gestion des exceptions
        try {
            //initialiser la requete
            db.initPrepar(sql);

            db.getPstm().setString(1, p.getRef());
            db.getPstm().setString(2, p.getNom());
            //p.setUser(new UserImpl().get(res));
            db.getPstm().setInt(3, p.getUser().getId());

            //execution de la requete
            ok = db.executeMaj();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;

    }

    @Override
    public List<Produit> liste() {
        List<Produit> produit = new ArrayList<Produit>();
        String sql = "SELECT * FROM produit";
        try {
            db.initPrepar(sql);
            rs = db.executeSelect();

            //tant qu'il ya des entrees de donnees on enregistre un nouveau produit
            while (rs.next()){

                Produit p  = new Produit();

                p.setRef(rs.getString(1));
                p.setNom(rs.getString(2));
                //p.setUser(rs.getInt(4));

                ok = db.executeMaj();
                db.closeConnection();

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return produit;
    }

    @Override
    public int update(Produit p) {

        String sql = "UPDATE produit SET nom= ?,user= ? WHERE ref=?";
        //gestion des exceptions
        try {
            //initialiser la requete
            db.initPrepar(sql);


            db.getPstm().setString(1, p.getNom());
            db.getPstm().setInt(2, p.getUser().getId());
            db.getPstm().setString(3, p.getRef());


            //execution de la requete
            ok = db.executeMaj();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }
}
