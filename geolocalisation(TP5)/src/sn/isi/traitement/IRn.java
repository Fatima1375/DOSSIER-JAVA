package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.List;

public interface IRn {
    public Rn saisieRn();
    //public void affichage(List<Zone> z);
    public void affichage(Rn rn);
}
