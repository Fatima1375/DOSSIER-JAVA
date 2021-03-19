package sn.isi.traitement;

import sn.isi.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedecinImp implements IMedecin{


    public Medecin saisie(){
        Scanner saisie = new Scanner(System.in);
        Medecin m = null;

        System.out.println("quel genre de medecin voulez vous enregistrer ?");
        System.out.println("GENERALISTE ==> 1");
        System.out.println("SPECIALISTE==> 2");
        System.out.println("CHEF       ==> 3");
        int menuAccueil = Integer.parseInt(saisie.nextLine());
        String reponse= null;
        //Boolean rep = false;
        switch(menuAccueil)
        {
            case  1:
                m = new MedecinGeneraliste();

                System.out.println("Entrer l'identifiant du medecin :");
                m.setIdPersonne(Integer.parseInt(saisie.nextLine()));
                System.out.println("Entrer le nom du medecin:");
                m.setNomPersonne(saisie.nextLine());
                System.out.println("Entrer le prenom du medecin:");
                m.setPrenomPersonne(saisie.nextLine());
                Services service = new Services();
                System.out.println("Entrer l'identifiant de son service:");
                service.setIdService(Integer.parseInt(saisie.nextLine()));
                System.out.println("Entrer le nom du service: ");
                service.setNomService(saisie.nextLine());
                m.setService(service);

                List<String> list = new ArrayList<>();
                do {
                    String specialite;
                    System.out.println("Entrer les specialites du medecin:");
                    specialite=saisie.nextLine();
                    list.add(specialite);
                    ((MedecinGeneraliste) m).setListeSpecialites(list);
                    System.out.println("D'autres specialites? o/n");
                    reponse=saisie.nextLine();
                }while(reponse.equalsIgnoreCase("o"));

                break;
            case 2:
                 m = new MedecinSpecialiste();
                System.out.println("Entrer l'identifiant du medecin :");
                m.setIdPersonne(Integer.parseInt(saisie.nextLine()));
                System.out.println("Entrer le nom du medecin :");
                m.setNomPersonne(saisie.nextLine());
                System.out.println("Entrer le prenom du medecin :");
                m.setPrenomPersonne(saisie.nextLine());
                System.out.println("Entrer le service du medecin :");
                Services s= new Services();
                System.out.println("Entrer l'identifiant du medecin :");
                s.setIdService(Integer.parseInt(saisie.nextLine()));
                System.out.println("Entrer le nom du medecin :");
                s.setNomService(saisie.nextLine());
                m.setService(s);
                System.out.println("Entrer les specialites du medecin :");
                ((MedecinSpecialiste) m).setSpecialite(saisie.nextLine());
                //((MedecinGeneraliste)m).setListeSpecialistes(saisie.nextLine());
                break;
            case 3:
                m = new MedecinChef();
                System.out.println("Entrer l'identifiant du medecin :");
                m.setIdPersonne(Integer.parseInt(saisie.nextLine()));
                System.out.println("Entrer le nom du medecin :");
                m.setNomPersonne(saisie.nextLine());
                System.out.println("Entrer le prenom du medecin :");
                m.setPrenomPersonne(saisie.nextLine());
                Services srv = new Services();
                System.out.println("Entrer l'identifiant du service :");
                srv.setIdService(Integer.parseInt(saisie.nextLine()));
                System.out.println("Entrer le nom du service :");
                srv.setNomService(saisie.nextLine());
                m.setService(srv);
                System.out.println("Le Bureau du medecin:");
                ((MedecinChef) m).setBureau(saisie.nextLine());
                //((MedecinChef) m).setBureau(saisie.nextLine());
                break;
        }
        return  m;
    }




    public  void  affichage(Medecin m){
            System.out.println(" IDENTIFIANT :" +m.getIdPersonne());
            System.out.println(" NOM:" +m.getNomPersonne());
            System.out.println(" PRENOM:" +m.getPrenomPersonne());

            if (m instanceof MedecinGeneraliste)
            {
                System.out.println(" IDENTIFIANT DU SERVICE:" +m.getService().getIdService());
                System.out.println(" NOM DU SERVICE :" +m.getService().getNomService());
                System.out.println("LISTE SPECIALITES DU MEDECIN : ");
                for(String specialite: ((MedecinGeneraliste) m).getListeSpecialites()){
                    System.out.println("specialites:"+specialite);
                }

            }
            if (m instanceof MedecinSpecialiste)
            {
                System.out.println("SPECIALITE : "+((MedecinSpecialiste) m).getSpecialite());
            }
            if (m instanceof MedecinChef)
            {
                System.out.println("BUREAU :" +((MedecinChef) m).getBureau());
            }
    }

}
