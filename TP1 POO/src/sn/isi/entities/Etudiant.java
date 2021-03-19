package sn.isi.entities;

import java.util.Scanner;

public class Etudiant {
    private String mat;
    private String nom;
    private String prenom;

    public Etudiant() {
    }

    public Etudiant(String mat, String nom, String prenom) {
        this.mat = mat;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }







}
