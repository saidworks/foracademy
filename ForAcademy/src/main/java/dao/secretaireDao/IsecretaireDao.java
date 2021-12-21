package dao.secretaireDao;

import models.Secretaire;

import java.util.List;

public interface IsecretaireDao {
    void saveSecretaire(Secretaire secretaire);
    Secretaire selectById(int id);
    List<Secretaire> selectAll();
    void deleteSecretaire(int id);
    void updateSecretaire(Secretaire secretaire, int id);
}
