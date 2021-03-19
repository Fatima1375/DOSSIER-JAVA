package main;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;
import sn.isi.traitement.IRn;
import sn.isi.traitement.IZone;
import sn.isi.traitement.RnImpl;
import sn.isi.traitement.ZoneImpl;

import java.util.List;

public class Main {
    public  static  void main(String[] args){

        IRn rn = new RnImpl();
        //IZone zone = new ZoneImpl();
        Rn r = rn.saisieRn();
        rn.affichage(r);
       // zone.affichage((Zone) zone);


    }
}
