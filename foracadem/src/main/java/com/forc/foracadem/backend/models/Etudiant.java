package com.forc.foracadem.backend.models;

public class Etudiant extends Utilisateur{
    public Etudiant() {
    }

    public Etudiant(int id_user, String nom_user, String prenom_user, String genre_user, String telephone, String email, String password, boolean status_user, int id_adress, int id_role) {
        super(id_user, nom_user, prenom_user, genre_user, telephone, email, password, status_user, id_adress, id_role);
    }
}
