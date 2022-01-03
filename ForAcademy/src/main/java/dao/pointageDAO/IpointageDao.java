package dao.pointageDAO;

import models.Pointage;
import models.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IpointageDao {
    boolean savePointage(Utilisateur utilisateur, Pointage pointage) throws SQLException;

    List<Pointage> getAllPointage();
    Pointage selectPointageById(int id);

}
