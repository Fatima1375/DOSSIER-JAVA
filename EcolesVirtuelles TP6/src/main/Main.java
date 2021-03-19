package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.traitement.EcoleImpl;
import sn.isi.traitement.IEcole;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        IEcole ie = new EcoleImpl();
        Map<Specialite, Ecole> mapecole = new HashMap<>();
        mapecole = ie.saisie();
        ie.affichageSpecialites(mapecole);
        ie.affichageEcole(mapecole);

    }
}
