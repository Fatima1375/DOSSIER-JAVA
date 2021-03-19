package sn.isi.dao;

import sn.isi.entities.User;

import java.util.List;

public class UserImpl implements IUser{
    private DB db = new DB();
    private int ok;
    @Override
    public int add(User u) {
        String sql = "INSERT INTO user VALUES(NULL, ?, ?, ?, ?)";
        //gestion des exceptions
        try {
             //initialiser la requete
            db.initPrepar(sql);


            db.getPstm().setString(1, u.getNom() );
            db.getPstm().setString(2, u.getPrenom());
            db.getPstm().setString(3, u.getPassword());
            db.getPstm().setString(4, u.getEmail());

            //execution de la requete
            ok = db.executeMaj();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<User> liste() {
        return null;
    }

    @Override
    public int update(User u) {
        String sql = "UPDATE user SET nom =?,prenom= ?,password= ?,email= ? WHERE id=?";
        //gestion des exceptions
        try {
            //initialiser la requete
            db.initPrepar(sql);


            db.getPstm().setString(1, u.getNom() );
            db.getPstm().setString(2, u.getPrenom());
            db.getPstm().setString(3, u.getPassword());
            db.getPstm().setString(4, u.getEmail());
            db.getPstm().setInt(5, u.getId());

            //execution de la requete
            ok = db.executeMaj();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }
}
//gestion des dates en java
//SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd")
//sdf.format(r.getDate)