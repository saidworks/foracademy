package dao.admin;

import models.Admin;
import models.Adress;
import models.Specialite;
import utils.DBUtil;
import utils.Utils;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class AdminDaoImp implements AdminDao{
    @Override
    public List<Admin> findAll() {

        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        List<Admin> admins = new LinkedList<>();

        String query = "SELECT * FROM utilisateur INNER JOIN admin ON  id_user = id_admin;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Admin admin = new Admin(resultSet.getInt("id_user"),
                        resultSet.getString("nom_user"), resultSet.getString("prenom_user"),resultSet.getString("genre_user"),
                        resultSet.getString("telephone"),resultSet.getString("email"), resultSet.getString("password"), resultSet.getBoolean("status_user"), resultSet.getInt("id_adress"), resultSet.getInt("id_role"));
                admins.add(admin);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }

        }

        return admins;
    }

    @Override
    public Admin findById(int id) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        String query ="SELECT * FROM utilisateur INNER JOIN admin ON id_user = id_admin WHERE id_user= ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)){
            preparedStatement.setInt(1,id);
            ResultSet resultSet =  preparedStatement.executeQuery();
            if(resultSet.next()){
                Admin admin = new Admin(resultSet.getInt("id_user"),
                        resultSet.getString("nom_user"), resultSet.getString("prenom_user"),resultSet.getString("genre_user"),
                        resultSet.getString("telephone"),resultSet.getString("email"), resultSet.getString("password"), resultSet.getBoolean("status_user"), resultSet.getInt("id_adress"), resultSet.getInt("id_role"));
                return admin;
            }

        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
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
            preparedStatement.setString(3, admin.getGenre_user());
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
            preparedStatement2.setInt(1, lastInserId);


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
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return ;
        }
        String query = "UPDATE utilisateur INNER JOIN admin ON id_user = id_admin SET nom_user = ? , prenom_user =?, genre_user =?, telephone =?, email =?, password =?, status_user =?, id_adress =?, id_role =? WHERE id_user= ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            preparedStatement.setString(1, admin.getNom_user());
            preparedStatement.setString(2, admin.getPrenom_user());
            preparedStatement.setString(3, admin.getGenre_user());
            preparedStatement.setString(4,  admin.getTelephone());
            preparedStatement.setString(5,  admin.getEmail());

            preparedStatement.setString(6,  admin.getPassword());
            preparedStatement.setBoolean(7,  admin.isStatus_user());
            preparedStatement.setInt(8,  admin.getId_adress());
            preparedStatement.setInt(9,  admin.getId_role());
            preparedStatement.setInt(10, admin.getId_user());
            preparedStatement.executeUpdate();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }

}
