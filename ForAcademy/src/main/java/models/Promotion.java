package models;

public class Promotion {
    private int id_promo;
    private String nom_promo;
    private String annee_promo;
    private String date_debut_promo;
    private String date_fin_promo;

    Promotion(){}

    public Promotion(String nom_promo, String annee_promo, String date_debut_promo, String date_fin_promo) {
        this.nom_promo = nom_promo;
        this.annee_promo = annee_promo;
        this.date_debut_promo = date_debut_promo;
        this.date_fin_promo = date_fin_promo;
    }

    public int getId_promo() {
        return id_promo;
    }

    public void setId_promo(int id_promo) {
        this.id_promo = id_promo;
    }

    public String getNom_promo() {
        return nom_promo;
    }

    public void setNom_promo(String nom_promo) {
        this.nom_promo = nom_promo;
    }

    public String getAnnee_promo() {
        return annee_promo;
    }

    public void setAnnee_promo(String annee_promo) {
        this.annee_promo = annee_promo;
    }

    public String getDate_debut_promo() {
        return date_debut_promo;
    }

    public void setDate_debut_promo(String date_debut_promo) {
        this.date_debut_promo = date_debut_promo;
    }

    public String getDate_fin_promo() {
        return date_fin_promo;
    }

    public void setDate_fin_promo(String date_fin_promo) {
        this.date_fin_promo = date_fin_promo;
    }
}
