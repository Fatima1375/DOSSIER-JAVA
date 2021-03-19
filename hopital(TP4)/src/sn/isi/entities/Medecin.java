package sn.isi.entities;

public class Medecin extends Personne{
    Services service;

    public Medecin() {
    }

    public Medecin(Services service) {
        this.service = service;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}
