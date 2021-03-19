package sn.isi.service;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserImpl implements IUser {
    Scanner scanner = new Scanner(System.in);
    @Override
    public User saisieUser() {
        User u  = new User();
        System.out.println("Veillez entrer l'identifiant:");
        u.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Veillez entrer votre nom:");
        u.setNom(scanner.nextLine());
        System.out.println("Veillez entrer votre prenom:");
        u.setPrenom(scanner.nextLine());
        System.out.println("Veillez entrer votre email:");
        u.setEmail(scanner.nextLine());
        System.out.println("Veillez entrer votre password:");
        u.setPassword(scanner.nextLine());
        System.out.println("Veillez entrer votre etat: 1/0");
        u.setEtat(Integer.parseInt(scanner.nextLine()));

        return u;
    }

    @Override
    public void affichage(User user) {
        System.out.println("L'IDENTIFIANT : "+user.getId());
        System.out.println("LE NOM :"+user.getNom());
        System.out.println("LE PRENOM :"+user.getPrenom());
        System.out.println("L'EMAIL :"+user.getEmail());
        System.out.println("LE PASSWORD : "+user.getPassword());
        System.out.println("L'ETAT :"+user.getEtat());
    }
}
