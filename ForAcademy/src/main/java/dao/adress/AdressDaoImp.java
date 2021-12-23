package dao.adress;

import models.Adress;
import models.Specialite;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class AdressDaoImp implements AdressDao {

    @Override
    public List<Adress> findAll() {

        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        List<Adress> adresses = new LinkedList<>();

        String query = "SELECT * FROM adresse;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Adress adress = new Adress(resultSet.getInt("id_adress"),
                        resultSet.getString("line_adress"), resultSet.getString("ville_adress"),
                        resultSet.getInt("code_postale_adress"));
                adresses.add(adress);
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
        return adresses;

    }

    @Override
    public Adress findById(int id) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        String query ="SELECT * FROM adresse WHERE id_adress= ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)){
            preparedStatement.setInt(1,id);
            ResultSet resultSet =  preparedStatement.executeQuery();
            if(resultSet.next()){
                Adress adress = new Adress(resultSet.getInt("id_adress"),
                        resultSet.getString("line_adress"), resultSet.getString("ville_adress"),
                        resultSet.getInt("code_postale_adress"));
                return adress;
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
    public void save(Adress adress) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return;
        }
        String query ="INSERT INTO adresse (line_adress, ville_adress, code_postale_adress) VALUES (?, ?, ?);";
        try(PreparedStatement preparedStatement = conn.prepareStatement(query);){

            preparedStatement.setString(1, adress.getLine_adress());
            preparedStatement.setString(2, adress.getVille_adress());
            preparedStatement.setInt(3, adress.getCode_postale_adress());
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
    public void update(Adress adress) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return ;
        }
        String query = "UPDATE adresse SET line_adress = ?, ville_adress = ?, code_postale_adress = ?  WHERE id_adress = ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {
            preparedStatement.setString(1, adress.getLine_adress());
            preparedStatement.setString(2, adress.getVille_adress());
            preparedStatement.setInt(3, adress.getCode_postale_adress());
            preparedStatement.setInt(4, adress.getId_adress());
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
        String query = "DELETE FROM adresse  WHERE id_adress = ?;";
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
