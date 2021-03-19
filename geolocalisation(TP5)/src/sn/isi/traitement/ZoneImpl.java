package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZoneImpl implements IZone{
    Scanner saisie = new Scanner(System.in);

    @Override
    public Zone saisieZone() {

        Zone z = new Zone();
        System.out.println("Entrer l'id de la zone:");
        z.setIdZone(Integer.parseInt(saisie.nextLine()));
        System.out.println("Entrer le nom de la zone:");
        z.setNom(saisie.nextLine());
        System.out.println("Entrer la latitude de la zone:");
        z.setLatitudeZ(Double.parseDouble(saisie.nextLine()));
        System.out.println("Entrer la longitude de la zone:");
        z.setLongitudeZ(Double.parseDouble(saisie.nextLine()));

        return z;
    }



    @Override
    public void affichage(Zone z) {
        System.out.println(" l'identifiant de la zone :" + z.getIdZone());
        System.out.println(" le nom  de la zone :" + z.getNom());
        System.out.println(" la latitude  de la zone:" +z.getLatitudeZ());
        System.out.println(" la longitude   de la zone:" +z.getLongitudeZ());
    }
}
