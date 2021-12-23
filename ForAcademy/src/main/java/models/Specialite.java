package models;

public class Specialite {
    private int id_specialite;
    private String nom_specialite;

    public Specialite(int id_specialite , String nom_specialite) {
        this.id_specialite = id_specialite;
        this.nom_specialite = nom_specialite;
    }

    public int getId_specialite() {
        return id_specialite;
    }

    public void setId_specialite(int id_specialite) {
        this.id_specialite = id_specialite;
    }

    public String getNom_specialite() {
        return nom_specialite;
    }

    public void setNom_specialite(String nom_specialite) {
        this.nom_specialite = nom_specialite;
    }
}
