package sn.isi.entities;

public class Employe extends Personne{
    private String email;
    private String password;
    private int etat;

    public Employe() {
    }

    public Employe(String email, String password, int etat) {
        this.email = email;
        this.password = password;
        this.etat = etat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
