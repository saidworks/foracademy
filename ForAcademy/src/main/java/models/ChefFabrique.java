package models;


import java.util.Date;

public class ChefFabrique extends Utilisateur{
    private Date date_recrutmnt_chefFabrique = new Date();

    public ChefFabrique() {
    }

    public ChefFabrique(int id_user , String nom_user, String prenom_user, boolean genre, String telephone, String email, String password, boolean status_user ) {
        super(id_user ,nom_user, prenom_user, genre, telephone,email, password, status_user);
        //Date date_recrutmnt_chefFabrique1 = date_recrutmnt_chefFabrique;
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
