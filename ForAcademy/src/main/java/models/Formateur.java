package models;

public class Formateur extends User {
    private String date_recrutement;
    public String getDate_recrutement() {
        return date_recrutement;
    }

    public void setDate_recrutement(String date_recrutement) {
        this.date_recrutement = date_recrutement;
    }

}
