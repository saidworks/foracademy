package models;

public class Utilisateur {

    private int id_user;
    private String nom_user;
    private String prenom_user;
    private boolean genre_user;
    private String telephone;
    private String email;
    private String password;
    private boolean status_user;


    public Utilisateur(int id_user, String nom_user, String prenom_user, boolean genre_user,
                       String telephone, String email, String password, boolean status_user) {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.genre_user = genre_user;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.status_user = status_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public boolean isGenre_user() {
        return genre_user;
    }

    public void setGenre_user(boolean genre_user) {
        this.genre_user = genre_user;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus_user() {
        return status_user;
    }

    public void setStatus_user(boolean status_user) {
        this.status_user = status_user;
    }
    public Utilisateur getUtilisateur() {
        return new Utilisateur(id_user, nom_user,prenom_user, genre_user, telephone,email,password,status_user);
    }
    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_user=" + id_user +
                ", nom_user='" + nom_user + '\'' +
                ", prenom_user='" + prenom_user + '\'' +
                ", genre_user=" + genre_user +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status_user=" + status_user +
                '}';
    }
}
