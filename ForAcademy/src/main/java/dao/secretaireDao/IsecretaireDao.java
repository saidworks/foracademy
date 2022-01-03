package dao.secretaireDao;

import models.Secretaire;

import java.util.List;

public interface IsecretaireDao {
    boolean saveSecretaire(Secretaire secretaire);
    Secretaire selectById(int id);
    List<Secretaire> selectAll();
    void deleteSecretaire(int id);

    void updateSecretaire(Secretaire secretaire);
    void updateDetailsSecretaire(Secretaire secretaire, String col, String newValue);
}
