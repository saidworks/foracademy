package dao.secretaireDao;

import models.Secretaire;
import utils.DBUtil;
import utils.Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*public class SecretaireDaoImp implements IsecretaireDao {

    @Override
    public void saveSecretaire(Secretaire secretaire) {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;


        try {
            connection = DBUtil.getConnection();
            stmt = connection.createStatement();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO utilisateur(nom_user, prenom_user, telephone, email, password) VALUES(?,?,?,?,?)");
            ps.setString(1, secretaire.getNom_user());
            ps.setString(2, secretaire.getPrenom_user());
            ps.setString(3, secretaire.getTelephone());
            ps.setString(4, secretaire.getEmail());
            ps.setString(5, secretaire.getPassword());
            int i = ps.executeUpdate();
            int lastInserId = -1;
            rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
            if (rs.next()) {
                lastInserId = rs.getInt(1);
            }

            PreparedStatement ps1 = connection.prepareStatement("INSERT INTO secretaire(id_secretaire, date_recrutement_secret) VALUES (?,?)");
            ps1.setInt(1, lastInserId);
            ps1.setDate(2, Utils.getSqlDate(secretaire.getDate_recrutmnt_secret()));

            int j = ps1.executeUpdate();
            if (i == 1) {
                System.out.println("ps executed successfully");
            }
            if (j == 1) {
                System.out.println("succes ps 1");
                System.out.println(secretaire.getDate_recrutmnt_secret());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Secretaire selectById(int id) {
        Connection connection = null;
        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT date_recrutement_secret,id_user, nom_user, prenom_user, genre_user, telephone, email, password, status_user" +
                    " FROM secretaire JOIN utilisateur ON utilisateur.id_user = secretaire.id_secretaire WHERE utilisateur.id_user =" + id);
            while (rs.next()) {
                int id_user = rs.getInt("id_user");
                String nom_secretaire = rs.getString("nom_user");
                String prenom_secretaire = rs.getString("prenom_user");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String password = rs.getString("password");
                boolean genre_secretaire = rs.getBoolean("genre_user");
                boolean status_secretaire = rs.getBoolean("status_user");

                //Secretaire secretaire = new Secretaire(nom_secretaire, prenom_secretaire, genre_secretaire, telephone, email, password, status_secretaire);


                //secretaire.toString();
                return new Secretaire(id_user,nom_secretaire, prenom_secretaire, genre_secretaire, telephone, email, password, status_secretaire);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Secretaire> selectAll() {
        List<Secretaire> secretaires = new ArrayList<>();
        Connection connection = null;

        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM secretaire JOIN utilisateur SELECT * FROM secretaire s JOIN utilisateur u on s.id_secretaire = u.id_user");

            while (rs.next()) {
                int id_secretaire = rs.getInt("id_secretaire");
                String nom_secretaire = rs.getString("nom_user");
                String prenom_secretaire = rs.getString("prenom_user");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String password = rs.getString("password");
                boolean genre_secretaire = rs.getBoolean("genre_user");
                boolean status_secretaire = rs.getBoolean("status_user");

                Secretaire secretaire = new Secretaire(id_secretaire ,nom_secretaire, prenom_secretaire, genre_secretaire, telephone, email, password, status_secretaire);

                secretaires.add(secretaire);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return secretaires;
    }

    @Override
    public void deleteSecretaire(int id) {
        // can we delete utilisateur???
        Connection connection = null;
        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("DELETE ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateSecretaire(Secretaire secretaire) {

    }

    @Override
    public void updateDetailsSecretaire(Secretaire secretaire, String col, String newValue) {
        Connection connection = null;

        try {
            connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE utilisateur SET "+ col+"= ? WHERE id_user="+secretaire.getId_user());
            ps.setString(1, newValue);

            int i = ps.executeUpdate();
            if (i == 1){
                System.out.println("change "+col+" successfully");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

*/
