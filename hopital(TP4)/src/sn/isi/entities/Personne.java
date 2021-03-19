package sn.isi.entities;

public class Personne {
    private int idPersonne;
    private String nomPersonne;
    private String prenomPersonne;

    public Personne() {
    }

    public Personne(int idPersonne, String nomPersonne, String prenomPersonne) {
        this.idPersonne = idPersonne;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }
}
