package sn.isi.traitement;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EcoleImpl implements IEcole{
    Scanner scan = new Scanner(System.in);


    @Override
    public Map<Specialite, Ecole> saisie() {
        Map<Specialite, Ecole> mapecole = new HashMap<Specialite, Ecole>();
        String reponse = null;

        do {
        Ecole e = new Ecole();
        Specialite s = new Specialite();


        System.out.println("Entrer l'identifiant de l'ecole:");
        e.setIdEcole(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le nom de l'ecole:");
        e.setNomEcole(scan.nextLine());


        System.out.println("Entrer l'identifiant de la specialite:");
        s.setIdSpecialite(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le nom de la specialite:");
        s.setNomSpecialite((scan.nextLine()));
        e.setSpecialite(s);

        mapecole.put(s,e);

        System.out.println("CONTINUER ? o/n");
        reponse = scan.nextLine();
        }while (reponse.equalsIgnoreCase("o"));
        return mapecole;
    }

    @Override
    public void affichageSpecialites(Map<Specialite, Ecole> specialiteEcoleMap) {
        for (Specialite s: specialiteEcoleMap.keySet()) {
            System.out.println("id: " + s.getIdSpecialite() + " nom: " + s.getNomSpecialite());

        }
    }

    @Override
    public void affichageEcole(Map<Specialite, Ecole> ecoleMap) {
        for (Ecole e: ecoleMap.values()) {
            System.out.println("id: " + e.getIdEcole()+ " nom: " + e.getNomEcole() + " Specilite de l'ecole: " + e.getSpecialite().getIdSpecialite());

        }
    }
}
