package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImpl implements IRn {
    Scanner saisie = new Scanner(System.in);
    Zone zone = new Zone();
    String reponse = null;
    @Override
    public Rn saisieRn() {
        Rn rn = new Rn();
       // IZone z= new ZoneImpl();

        System.out.println("Entrer l'id de la RN:");
        rn.setIdRn(Integer.parseInt(saisie.nextLine()));
        saisie.nextLine();
        System.out.println("Entrer la latitude de la RN:");
        rn.setLatitudeRn(Double.parseDouble(saisie.nextLine()));
        System.out.println("Entrer la longitude de la RN:");
        rn.setLongitudeRn(Double.parseDouble(saisie.nextLine()));
        System.out.println("Entrer les zones de la RN:");
        List<Zone> listZone = new ArrayList<>();
        do {
            Zone zn = new Zone();
            IZone z= new ZoneImpl();
            //appel de la fonction de saisieZone
            zn = z.saisieZone();
            //ajout de la saisie dans la liste
            listZone.add(zn);
            System.out.println("Autres zones ?");
            reponse = saisie.nextLine();
        }while (reponse.equalsIgnoreCase("o"));
        rn.setListeZones(listZone);


        return rn;
    }



    @Override
    public void affichage(Rn rn) {
        IZone z= new ZoneImpl();
        System.out.println(" l'identifiant de la RN :" + rn.getIdRn());
        System.out.println(" la latitude de la RN:" +rn.getLatitudeRn());
        System.out.println(" la longitude de la RN :" +rn.getLongitudeRn());
        System.out.println("Informations zone:" );

        for(Zone zone: rn.getListeZones()){
            z.affichage(zone);
        }

    }
}
