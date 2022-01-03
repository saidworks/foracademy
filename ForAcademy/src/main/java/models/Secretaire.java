package models;


import java.util.Date;

public class Secretaire extends Utilisateur{
    private Date date_recrutmnt_secret = new Date();

    public Secretaire() {
    }

    public Secretaire(int id_user ,String nom_user, String prenom_user, String genre_user, String telephone, String email, String password, boolean status_user, int id_adress, int id_role ) {
        super(id_user ,nom_user, prenom_user, genre_user, telephone,email, password, status_user, id_adress, id_role);
        Date date_recrutmnt_secret1 = date_recrutmnt_secret;
    }

    public Date getDate_recrutmnt_secret()
    {
        return date_recrutmnt_secret;
    }

    @Override
    public String toString() {
        return "Secretaire{" +
                "date_recrutmnt_secret=" + date_recrutmnt_secret +
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
