package models;


import java.util.Date;

public class Secretaire extends Utilisateur{
    private Date date_recrutmnt_secret = new Date();


    public Secretaire(String nom_user, String prenom_user, boolean genre, String telephone, String email, String password, boolean status_user ) {
        super( nom_user, prenom_user, genre, telephone, email, password, status_user);
        Date date_recrutmnt_secret1 = date_recrutmnt_secret;
    }

    public Date getDate_recrutmnt_secret() {
        return date_recrutmnt_secret;
    }
/*
    public void setDate_recrutmnt_secret() {
        this.date_recrutmnt_secret = new Date();
    }

 */
}
