package sn.isi.entities;

public class Ecole {
    private int idEcole;
    private String nomEcole;
    private Specialite specialite;

    public Ecole() {
    }

    public Ecole(int idEcole, String nomEcole, sn.isi.entities.Specialite specialite) {
        this.idEcole = idEcole;
        this.nomEcole = nomEcole;
        this.specialite = specialite;
    }

    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }


}
