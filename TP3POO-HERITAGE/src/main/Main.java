package main;

import sn.isi.entities.Consultant;
import sn.isi.entities.Employe;
import sn.isi.service.ConsultantImp;
import sn.isi.service.EmployeImp;
import sn.isi.service.IConsultant;
import sn.isi.service.IEmploye;

public class Main {
    public static void main(String[] args) {
        //saisie et affichage employe
        IEmploye iEmploye = new EmployeImp();
        Employe e = iEmploye.saisieEmploye();
        iEmploye.affichage(e);

        //saisie et affichage consultant
        IConsultant iConsultant = new ConsultantImp();
        Consultant c = iConsultant.saisieConsultant();
        iConsultant.affichage(c);
    }
}
