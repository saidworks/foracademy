package com.forc.foracadem.backend.models;


import java.util.Date;

public class ChefFabrique extends Utilisateur {
    private Date date_recrutmnt_chefFabrique ;

    public ChefFabrique() {
    }

    public ChefFabrique(int id_user, String nom_user, String prenom_user, String genre_user,
                        String telephone, String email, String password, boolean status_user, int id_adress, int id_role, Date date_recrutmnt_chefFabrique ) {
        super(id_user ,nom_user, prenom_user, genre_user, telephone,email, password, status_user, id_adress, id_role);
       this.date_recrutmnt_chefFabrique= date_recrutmnt_chefFabrique;
    }

    public Date getDate_recrutmnt_chefFabrique() {
        return date_recrutmnt_chefFabrique;
    }

    @Override
    public String toString() {
        return "ChefFabrique{" +
                "date_recrutmnt_chefFabrique=" + date_recrutmnt_chefFabrique +
                "id_user=" + getId_user() +
                ", nom_user='" + getNom_user() + '\'' +
                ", prenom_user='" + getPrenom_user() + '\'' +
                ", genre_user=" +
                ", telephone='" + getTelephone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}
