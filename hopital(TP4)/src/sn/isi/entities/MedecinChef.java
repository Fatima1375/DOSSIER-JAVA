package sn.isi.entities;

public class MedecinChef extends Medecin{
    private String bureau;

    public MedecinChef() {
    }

    public MedecinChef(String bureau) {
        this.bureau = bureau;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
