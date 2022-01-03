package models;

public class Utilisateur {

    private int id_user;
    private String nom_user;
    private String prenom_user;
    private String genre_user;
    private String telephone;
    private String email;
    private String password;
    private boolean status_user;
    private int id_adress;
    private int id_role;

    public Utilisateur() {
    }

    public Utilisateur(int id_user, String nom_user, String prenom_user, String genre_user,
                       String telephone, String email, String password, boolean status_user, int id_adress, int id_role) {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.genre_user = genre_user;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.status_user = status_user;
        this.id_adress = id_adress;
        this.id_role = id_role;
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


    public String getGenre_user() {
        return genre_user;
    }

    public void setGenre_user(String genre_user) {
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


    public int getId_adress() {
        return id_adress;
    }

    public void setId_adress(int id_adress) {
        this.id_adress = id_adress;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
    public Utilisateur getUtilisateur() {
        return new Utilisateur(id_user, nom_user,prenom_user, genre_user, telephone,email,password,status_user, id_adress, id_role);
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
                ", id_adress=" + id_adress +
                ", id_role=" + id_role +
                '}';
    }
}
