package models;

public class Admin extends Utilisateur{
    public Admin() {
    }

    public Admin(int id_user, String nom_user, String prenom_user, boolean genre_user, String telephone, String email, String password, boolean status_user, int id_adress, int id_role) {
        super(id_user, nom_user, prenom_user, genre_user, telephone, email, password, status_user, id_adress, id_role);
    }

    @Override
    public String toString() {
        return "Admin{}";
    }
}

