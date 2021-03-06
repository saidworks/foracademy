package com.forc.foracadem.backend.models;

public class Admin extends Utilisateur{
    public Admin() {
    }

    public Admin(int id_user) {
        super(id_user);
    }

    public Admin(int id_user, String nom_user, String prenom_user, String genre_user, String telephone, String email, String password, boolean status_user, int id_adress, int id_role) {
        super(id_user, nom_user, prenom_user, genre_user, telephone, email, password, status_user, id_adress, id_role);
    }


    @Override
    public String toString() {
        return "Admin{" +
                "id_user=" + getId_user() +
                ", nom_user='" + getNom_user() + '\'' +
                ", prenom_user='" + getPrenom_user() + '\'' +
                ", genre_user=" + getGenre_user() +
                ", telephone='" + getTelephone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", status_user=" + isStatus_user() +
                ", id_adress=" + getId_adress() +
                ", id_role=" + getId_role() +
                '}';
    }

}

