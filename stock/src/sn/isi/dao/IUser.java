package sn.isi.dao;

import sn.isi.entities.User;

import java.util.List;

public interface IUser {
    //ajouter user
    public int add(User u);
    //liste user
    public List<User> liste();
    //modifier user
    public int update(User u );

}
