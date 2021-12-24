package dao.admin;

import models.Adress;

import java.util.List;

public interface AdminDao {
    List<Adress> findAll();
    Adress findById(int id);
    void save(Adress adress);
    void update (Adress adress);
    void deleteById(int id);
}
