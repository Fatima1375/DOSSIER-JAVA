package sn.isi.service;

import sn.isi.entities.Employe;

import java.util.Scanner;

public class EmployeImp implements IEmploye{
    Scanner scanner = new Scanner(System.in);
    @Override
    public Employe saisieEmploye() {
        Employe emp = new Employe();
        System.out.println("Veillez entrer l'identifiant:");
        emp.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Veillez entrer votre nom:");
        emp.setNom(scanner.nextLine());
        System.out.println("Veillez entrer votre prenom:");
        emp.setPrenom(scanner.nextLine());
        System.out.println("Veillez entrer votre email:");
        emp.setEmail(scanner.nextLine());
        System.out.println("Veillez entrer votre password:");
        emp.setPassword(scanner.nextLine());
        System.out.println("Veillez entrer votre etat: 1/0");
        emp.setEtat(Integer.parseInt(scanner.nextLine()));

        return emp;
    }

    @Override
    public void affichage(Employe employe) {
        System.out.println("L'IDENTIFIANT : "+employe.getId());
        System.out.println("LE NOM :"+employe.getNom());
        System.out.println("LE PRENOM :"+employe.getPrenom());
        System.out.println("L'EMAIL :"+employe.getEmail());
        System.out.println("LE PASSWORD : "+employe.getPassword());
        System.out.println("L'ETAT :"+employe.getEtat());
    }
}
