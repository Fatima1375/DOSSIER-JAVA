package sn.isi.entities;

public class Consultant extends Personne{
    private int nbHeure;
    private double tauxHoraire;

    public Consultant() {
    }

    public Consultant(int nbHeure, double tauxHoraire) {
        this.nbHeure = nbHeure;
        this.tauxHoraire = tauxHoraire;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
