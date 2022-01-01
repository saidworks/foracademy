package dao.pointageDAO;

import models.Pointage;
import models.Utilisateur;
import utils.DBUtil;
import utils.Utils;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointageDaoImp implements IpointageDao {
    @Override
    public boolean savePointage(Utilisateur utilisateur, Pointage pointage) throws SQLException {
        Connection connection = null;

        connection = DBUtil.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO pointage(h_arrivee_pointage, h_depart_pointage ,date_pointage, id_user) VALUES(?,?,?,?) ");
            ps.setTimestamp(1, Utils.getSqlDateTime(pointage.getH_arrivee_pointage()));
            ps.setTimestamp(2, Utils.getSqlDateTime(pointage.getH_departe_pointage()));
            ps.setDate(3, Utils.getSqlDate(pointage.getDate_pointage()));
            ps.setInt(4,utilisateur.getId_user());

            int i = ps.executeUpdate();
            if (i == 1){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return false;
    }


    @Override
    public List<Pointage> getAllPointage()
    {
        List<Pointage> allPointages = new ArrayList<>();
        Connection connection = null;

        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pointage");

            while (rs.next()){
                int id = rs.getInt("id_pointage");
                LocalDateTime time_arrive = Utils.getJavaLocalDateTime(rs.getTimestamp("h_arrivee_pointage"));
                LocalDateTime time_depart = Utils.getJavaLocalDateTime(rs.getTimestamp("h_depart_pointage"));
                Date date_pointage = rs.getDate("date_pointage");
                int id_user = rs.getInt("id_user");
                Pointage pointage = new Pointage(id, time_arrive, time_depart, date_pointage, id_user);
                allPointages.add(pointage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allPointages;
    }

    @Override
    public Pointage selectPointageById(int id) {
        Connection connection = null;
        Pointage pointage ;
        connection = DBUtil.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pointage where id_pointage="+id);
            while (rs.next()){
                int id_pointage = rs.getInt("id_pointage");
                LocalDateTime h_arrivee_pointage = Utils.getJavaLocalDateTime(rs.getTimestamp("h_arrivee_pointage"));
                LocalDateTime h_depart_pointage = Utils.getJavaLocalDateTime(rs.getTimestamp("h_depart_pointage"));
                Date date_pointage = rs.getDate("date_pointage");
                int id_user = rs.getInt("id_user");
                pointage = new Pointage(id_pointage, h_arrivee_pointage, h_depart_pointage, date_pointage, id_user);
                return pointage;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
