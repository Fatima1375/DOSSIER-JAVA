package sn.isi.dao;

import sn.isi.entities.Etudiant;

import java.util.Scanner;

public class EtudiantDB {


    Scanner texte = new Scanner(System.in);
    public Etudiant creation(){
        Etudiant et = new Etudiant();

        System.out.println("entrer le matricule:");
        et.setMat(texte.nextLine());
        System.out.println("entrer le nom:");
        et.setNom(texte.nextLine());
        System.out.println("entrer le prenom:");
        et.setPrenom(texte.nextLine());
        return et;
    }

    public void affichage(Etudiant et) {

        System.out.println(" le matricule :" +et.getMat());
        System.out.println(" le nom :" +et.getNom());
        System.out.println(" le prenom :" +et.getPrenom());


    }
    public void AfficheMessage(){
        System.out.println("Etudiant cree.");
        DB d = new DB();
        d.getMessage();

    }
}
