package main;

import sn.isi.dao.EtudiantDB;
import sn.isi.entities.Etudiant;


public class Main {
    public static void main(String[] args){
        EtudiantDB etudiantDB = new EtudiantDB();
        Etudiant e = new Etudiant();
        etudiantDB.AfficheMessage();
       e = etudiantDB.creation();
        etudiantDB.affichage(e);


    }
}
