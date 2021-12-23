/*package dao.specialite;

import models.Specialite;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SpecialiteDaoImp implements SpecialiteDao {
    @Override
    public List<Specialite> findAll() {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        List<Specialite> specialites = new LinkedList<>();

        String query = "SELECT * FROM specialite;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Specialite specialite = new Specialite(resultSet.getInt("id_specialite"),
                        resultSet.getString("nom_specialite"));
                specialites.add(specialite);
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
        return specialites;
    }
    @Override
    public Specialite findById(int id) {

        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        String query ="SELECT * FROM specialite WHERE id_specialite= ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)){
            preparedStatement.setInt(1,id);
            ResultSet resultSet =  preparedStatement.executeQuery();
            if(resultSet.next()){
                Specialite specialite = new Specialite(resultSet.getInt("id_specialite"),
                        resultSet.getString("nom_specialite"));
                return specialite;
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
    public void save(Specialite specialite){
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return;
        }
        String query ="INSERT INTO specialite (nom_specialite) VALUES (?);";
        try(PreparedStatement preparedStatement = conn.prepareStatement(query);){

            preparedStatement.setString(1, specialite.getNom_specialite());
            preparedStatement.executeUpdate();
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    @Override
    public void update(Specialite specialite) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return ;
        }
        String query = "UPDATE specialite SET nom_specialite = ? WHERE id_specialite = ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            preparedStatement.setString(1, specialite.getNom_specialite());
            preparedStatement.setInt(2, specialite.getId_specialite());
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
    @Override
    public void deleteById(int id) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return ;
        }
        String query = "DELETE FROM specialite  WHERE id_specialite = ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            preparedStatement.setInt(1, id);
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

 */
