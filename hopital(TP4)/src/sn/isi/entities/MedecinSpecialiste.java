package sn.isi.entities;

import java.security.PrivateKey;

public class MedecinSpecialiste extends Medecin{
    private String specialite;

    public MedecinSpecialiste() {
    }

    public MedecinSpecialiste(String specialite) {
        this.specialite = specialite;

    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
