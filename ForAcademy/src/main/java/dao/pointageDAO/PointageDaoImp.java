package dao.pointageDAO;

import models.Pointage;
import models.Utilisateur;
import utils.DBUtil;
import utils.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PointageDaoImp implements IpointageDao {
    @Override
    public boolean savePointage(Utilisateur utilisateur, Pointage pointage) throws SQLException {
        Connection connection = null;

        connection = DBUtil.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO pointage(h_arrivee_pointage, date_pointage, id_user) VALUES(?,?,?) ");
            ps.setTimestamp(1, Utils.getSqlDateTime(pointage.getH_arrivee_pointage()));
            ps.setDate(2, Utils.getSqlDate(pointage.getDate_pointage()));
            ps.setInt(3,utilisateur.getId_user());

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
    public boolean updatePointage(Utilisateur utilisateur, Pointage pointage) throws SQLException {
        Connection connection = null;
        connection = DBUtil.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE pointage SET h_depart_pointage=? where id="+pointage.getId_pointage());
            ps.setTimestamp(1, Utils.getSqlDateTime(pointage.getH_departe_pointage()));
            int i = ps.executeUpdate();
            if (i == 1){
                System.out.println("depart saved successufly");
                return true;
            }
        } catch (SQLException e) {

        } finally {
            connection.close();
        }
        return false;
    }


    @Override
    public List<Pointage> getAllPointage() {
        return null;
    }

    @Override
    public Pointage selectPointageById(int id) {
        return null;
    }
}
