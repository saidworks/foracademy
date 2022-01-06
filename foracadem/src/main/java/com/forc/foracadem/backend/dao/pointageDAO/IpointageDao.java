package com.forc.foracadem.backend.dao.pointageDAO;

import com.forc.foracadem.backend.models.Pointage;
import com.forc.foracadem.backend.models.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IpointageDao {
    boolean savePointage(Utilisateur utilisateur, Pointage pointage) throws SQLException;

    List<Pointage> getAllPointage();
    Pointage selectPointageById(int id);

}
