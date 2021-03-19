package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.List;

public interface IProduit {
    //ajouter produit
    public int add(Produit p);
    //liste Produit
    public List<Produit> liste();
    //modifier Produit
    public int update(Produit p);
}
