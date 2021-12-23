package dao.adress;

import models.Adress;

import java.util.List;

public interface AdressDao {
    List<Adress> findAll();
    Adress findById(int id);
    void save(Adress adress);
    void update (Adress adress);
    void deleteById(int id);
}
