package dao.admin;

import models.Admin;
import utils.DBUtil;
import utils.Utils;

import java.sql.*;
import java.util.List;

public class AdminDaoImp implements AdminDao{
    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Admin findById(int id) {
        return null;
    }

    @Override
    public void save(Admin admin) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return;
        }
        String query1 ="INSERT INTO utilisateur(nom_user, prenom_user, genre_user, telephone, email, password, status_user, id_adress, id_role) VALUES(?,?,?,?,?,?,?,?,?)";
        String query2 ="INSERT INTO admin(id_admin) VALUES (?);";
        try(PreparedStatement preparedStatement = conn.prepareStatement(query1);){

            preparedStatement.setString(1, admin.getNom_user());
            preparedStatement.setString(2, admin.getPrenom_user());
            preparedStatement.setBoolean(3,  admin.isGenre_user());
            preparedStatement.setString(4,  admin.getTelephone());
            preparedStatement.setString(5,  admin.getEmail());

            preparedStatement.setString(6,  admin.getPassword());
            preparedStatement.setBoolean(7,  admin.isStatus_user());
            preparedStatement.setInt(8,  admin.getId_adress());
            preparedStatement.setInt(9,  admin.getId_role());
            int result = preparedStatement.executeUpdate();
            int lastInserId = -1;
           ResultSet resultSet = preparedStatement.executeQuery("SELECT LAST_INSERT_ID()");
            if (resultSet.next()) {
                lastInserId = resultSet.getInt(1);
            }

            PreparedStatement preparedStatement2 = conn.prepareStatement(query2);
            preparedStatement.setInt(1, lastInserId);


            int testQ2 = preparedStatement2.executeUpdate();
            if (result == 1) {
                System.out.println("first query executed");
            }
            if (testQ2 == 1) {
                System.out.println("last query executed");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void deleteById(int id) {

    }
}
