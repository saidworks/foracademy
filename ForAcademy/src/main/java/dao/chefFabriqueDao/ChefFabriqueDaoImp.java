package dao.chefFabriqueDao;

import models.ChefFabrique;
import utils.DBUtil;
import utils.Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ChefFabriqueDaoImp implements IChefFabriqueDao {


    @Override
    public void saveChefFabrique(ChefFabrique chefFabrique) {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;


        try {
            connection = DBUtil.getConnection();
            stmt = connection.createStatement();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO utilisateur(nom_user, prenom_user, telephone, email, password) VALUES(?,?,?,?,?)");
            ps.setString(1, chefFabrique.getNom_user());
            ps.setString(2, chefFabrique.getPrenom_user());
            ps.setString(3, chefFabrique.getTelephone());
            ps.setString(4, chefFabrique.getEmail());
            ps.setString(5, chefFabrique.getPassword());


            int i = ps.executeUpdate();
            int lastInserId = -1;
            rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
            if (rs.next()) {
                lastInserId = rs.getInt(1);
            }

            PreparedStatement ps1 = connection.prepareStatement("INSERT INTO cheffabrique(id_secretaire, date_recrutement_secret) VALUES (?,?)");
            ps1.setInt(1, lastInserId);
            ps1.setDate(2, Utils.getSqlDate(chefFabrique.getDate_recrutmnt_chefFabrique()));

            int j = ps1.executeUpdate();
            if (i == 1) {
                System.out.println("ps executed successfully");
            }
            if (j == 1) {
                System.out.println("succes ps 1");
                System.out.println(chefFabrique.getDate_recrutmnt_chefFabrique());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ChefFabrique selectById(int id) {
        Connection connection = null;
        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT date_recrutement_secret,id_user, nom_user, prenom_user, genre_user, telephone, email, password, status_user" +
                    " FROM secretaire JOIN utilisateur ON utilisateur.id_user = secretaire.id_secretaire WHERE utilisateur.id_user =" + id);
            while (rs.next()) {
                int id_user = rs.getInt("id_user");
                String nom_chefFabrique = rs.getString("nom_user");
                String prenom_chefFabrique = rs.getString("prenom_user");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String password = rs.getString("password");
                boolean genre_chefFabrique = rs.getBoolean("genre_user");
                boolean status_chefFabrique = rs.getBoolean("status_user");

                //Secretaire secretaire = new Secretaire(nom_secretaire, prenom_secretaire, genre_secretaire, telephone, email, password, status_secretaire);


                //secretaire.toString();
                return new ChefFabrique(id_user,nom_chefFabrique, prenom_chefFabrique, genre_chefFabrique, telephone, email, password, status_chefFabrique);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ChefFabrique> selectAll() {
        List<ChefFabrique> chefFabriques = new ArrayList<>();
        Connection connection = null;

        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cheffabrique JOIN utilisateur SELECT * FROM secretaire s JOIN utilisateur u on s.id_secretaire = u.id_user");

            while (rs.next()) {
                int id_chefFabrique = rs.getInt("id_secretaire");
                String nom_chefFabrique = rs.getString("nom_user");
                String prenom_chefFabrique = rs.getString("prenom_user");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String password = rs.getString("password");
                boolean genre_chefFabrique = rs.getBoolean("genre_user");
                boolean status_chefFabrique = rs.getBoolean("status_user");

                ChefFabrique chefFabrique = new ChefFabrique(id_chefFabrique ,nom_chefFabrique, prenom_chefFabrique, genre_chefFabrique, telephone, email, password, status_chefFabrique);

                chefFabriques.add(chefFabrique);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chefFabriques;
    }

    @Override
    public void deleteChefFabrique(int id) {
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
    public void updateChefFabrique(ChefFabrique chefFabrique) {

    }

    @Override
    public void updateDetailsChefFabrique(ChefFabrique chefFabrique, String col, String newValue) {
        Connection connection = null;

        try {
            connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE utilisateur SET "+ col+"= ? WHERE id_user="+chefFabrique.getId_user());
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


