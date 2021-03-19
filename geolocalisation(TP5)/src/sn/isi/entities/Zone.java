package sn.isi.entities;

public class Zone {
    private int idZone;
    private String nom;
    private double latitudeZ;
    private double longitudeZ;

    public Zone() {
    }

    public Zone(int idZone, String nom, double latitudeZ, double longitudeZ) {
        this.idZone = idZone;
        this.nom = nom;
        this.latitudeZ = latitudeZ;
        this.longitudeZ = longitudeZ;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLatitudeZ() {
        return latitudeZ;
    }

    public void setLatitudeZ(double latitudeZ) {
        this.latitudeZ = latitudeZ;
    }

    public double getLongitudeZ() {
        return longitudeZ;
    }

    public void setLongitudeZ(double longitudeZ) {
        this.longitudeZ = longitudeZ;
    }
}
