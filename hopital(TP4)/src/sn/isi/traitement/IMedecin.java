package sn.isi.traitement;

import sn.isi.entities.Medecin;
import sn.isi.entities.Services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface IMedecin {
    public Medecin saisie();
    public void affichage(Medecin medecin);
}
