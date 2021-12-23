package models;

public class Classe {
    private int id_class;
    private String nom_class;
    private String horaire_debut_class;
    private String horaire_fin_class;

    public Classe() {
    }

    public Classe(String nom_class, String horaire_debut_class, String horaire_fin_class) {
        this.nom_class = nom_class;
        this.horaire_debut_class = horaire_debut_class;
        this.horaire_fin_class = horaire_fin_class;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public String getNom_class() {
        return nom_class;
    }

    public void setNom_class(String nom_class) {
        this.nom_class = nom_class;
    }

    public String getHoraire_debut_class() {
        return horaire_debut_class;
    }

    public void setHoraire_debut_class(String horaire_debut_class) {
        this.horaire_debut_class = horaire_debut_class;
    }

    public String getHoraire_fin_class() {
        return horaire_fin_class;
    }

    public void setHoraire_fin_class(String horaire_fin_class) {
        this.horaire_fin_class = horaire_fin_class;
    }
}
