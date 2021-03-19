package main;

import sn.isi.dao.IProduit;
import sn.isi.dao.IUser;
import sn.isi.dao.ProduitImpl;
import sn.isi.dao.UserImpl;
import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
     //creer un user
        User u  = new User();
        u.setNom("ly");
        u.setPrenom("SAMBA");
        u.setPassword("passer");
        u.setEmail("samba@gmail.com");

        IUser iUser = new UserImpl();
         int ok = iUser.add(u);
        System.out.println(ok);


        /*//creation produit
        Produit p = new Produit();
        p.setRef("s12");
        p.setNom("sucre");
        User user = new User();
        user.setId(1);
        p.setUser(user);
        IProduit iprod = new ProduitImpl();
        int okay  = iprod.add(p);*/


        //MIS A JOUR DE L'UTILISATEUR
        IUser iUsr = new UserImpl();
        u.setId(1);
        iUsr.update(u);



    }
}
