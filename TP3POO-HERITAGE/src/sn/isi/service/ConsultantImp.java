package sn.isi.service;

import sn.isi.entities.Consultant;

import java.util.Scanner;

public class ConsultantImp implements IConsultant{
    Scanner scanner = new Scanner(System.in);
    @Override
    public Consultant saisieConsultant() {
        Consultant consultant = new Consultant();
        System.out.println("Veillez entrer l'identifiant:");
        consultant.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Veillez entrer votre nom:");
        consultant.setNom(scanner.nextLine());
        System.out.println("Veillez entrer votre prenom:");
        consultant.setPrenom(scanner.nextLine());
        System.out.println("Veillez entrer le nombre d'heures:");
        consultant.setNbHeure(Integer.parseInt(scanner.nextLine()));
        System.out.println("Veillez entrer le tauxHoraire:");
        consultant.setTauxHoraire(Double.parseDouble(scanner.nextLine()));


        return consultant;
    }

    @Override
    public void affichage(Consultant consultant) {
        System.out.println("L'IDENTIFIANT : "+consultant.getId());
        System.out.println("LE NOM :"+consultant.getNom());
        System.out.println("LE PRENOM :"+consultant.getPrenom());
        System.out.println("LE NOMBRE D'HEURES :"+consultant.getNbHeure());
        System.out.println("TAUX HORAIRE: "+consultant.getTauxHoraire() );

    }
}
