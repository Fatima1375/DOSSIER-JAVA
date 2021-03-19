package main;

import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.UserImpl;

public class Main {
    public static void main(String[] args){
        IUser iUser = new UserImpl();
        User  u = new User();
        u = iUser.saisieUser();
        iUser.affichage(u);
    }
}
