package dao.secretaireDao;

import models.Secretaire;
import utils.DBException;
import utils.DBUtil;

import java.sql.*;
import java.util.List;

public class SecretaireDaoImp implements IsecretaireDao{

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
            int lastInserId = -1;
            rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
            if (rs.next()){
                lastInserId = rs.getInt(1);
            }

            PreparedStatement ps1 = connection.prepareStatement("INSERT INTO secretaire(id_secretaire, date_recrutement_secret) VALUES (?,?)");
            ps1.setInt(1,lastInserId);
            ps1.setString(2,secretaire.getDate_recrutmnt_secret());
            int i = ps.executeUpdate();
            int j = ps1.executeUpdate();
            if (i == 1){
                System.out.println("ps executed successfully");
            }
            if (j == 1){
                System.out.println("succes ps 1");
            }

        } catch (DBException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Secretaire selectById(int id)
    {
        return null;
    }

    @Override
    public List<Secretaire> selectAll()
    {
        return null;
    }

    @Override
    public void deleteSecretaire(int id) {

    }

    @Override
    public void updateSecretaire(Secretaire secretaire, int id) {
    }
}
