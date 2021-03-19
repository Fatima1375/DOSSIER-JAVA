package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class Rn {
    private int idRn;
    private List<Zone> listeZones;
    private double latitudeRn;
    private double longitudeRn;

    public Rn() {
    }

    public Rn(int idRn, List<Zone> listeZones, double latitudeRn, double longitudeRn) {
        this.idRn = idRn;
        this.listeZones = listeZones;
        this.latitudeRn = latitudeRn;
        this.longitudeRn = longitudeRn;
    }

    public int getIdRn() {
        return idRn;
    }

    public void setIdRn(int idRn) {
        this.idRn = idRn;
    }

    public List<Zone> getListeZones() {
        return listeZones;
    }

    public void setListeZones(List<Zone> listeZones) {
        this.listeZones = listeZones;
    }

    public double getLatitudeRn() {
        return latitudeRn;
    }

    public void setLatitudeRn(double latitudeRn) {
        this.latitudeRn = latitudeRn;
    }

    public double getLongitudeRn() {
        return longitudeRn;
    }

    public void setLongitudeRn(double longitudeRn) {
        this.longitudeRn = longitudeRn;
    }
}
