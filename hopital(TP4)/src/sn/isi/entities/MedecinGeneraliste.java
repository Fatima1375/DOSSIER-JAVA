package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste extends Medecin{
    private List<String> listeSpecialites ;

    public MedecinGeneraliste() {
    }

    public MedecinGeneraliste(List<String> listeSpecialites) {
        this.listeSpecialites = listeSpecialites;
    }

    public List<String> getListeSpecialites() {
        return listeSpecialites;
    }

    public void setListeSpecialites(List<String> listeSpecialites) {
        this.listeSpecialites = listeSpecialites;
    }
}
