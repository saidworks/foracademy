package dao.secretaireDao;

import models.Secretaire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretaireDaoImpTest {
    IsecretaireDao secretaireDao = new SecretaireDaoImp();

    @Test
    void saveSecretaire() {
        Secretaire secretaire = new Secretaire(5 ,"aimad","aimad", true, "65765865876", "test@test", "test",true);
        boolean isSaved = secretaireDao.saveSecretaire(secretaire);
        assertEquals(true, isSaved );

    }

    @Test
    void selectById() {
    }

    @Test
    void selectAll() {
    }

    @Test
    void deleteSecretaire() {
    }

    @Test
    void updateSecretaire() {
    }

    @Test
    void updateDetailsSecretaire() {
    }
}