package models;

public class Secretaire extends Utilisateur{
    private String date_recrutmnt_secret;


    public Secretaire(String nom_user, String prenom_user, boolean genre, String telephone, String email, String password, boolean status_user, String date_recrutmnt_secret ) {
        super( nom_user, prenom_user, genre, telephone, email, password, status_user);
        String date_recrutmnt_secret1 = date_recrutmnt_secret;
    }

    public String getDate_recrutmnt_secret() {
        return date_recrutmnt_secret;
    }

    public void setDate_recrutmnt_secret(String date_recrutmnt_secret) {
        this.date_recrutmnt_secret = date_recrutmnt_secret;
    }
}
