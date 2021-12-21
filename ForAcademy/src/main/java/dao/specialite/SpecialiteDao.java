package dao.specialite;

import models.Specialite;

import java.util.List;

public interface SpecialiteDao {
    List<Specialite> findAll();
    Specialite findById(int id);
    void save(Specialite specialite);
    void update (Specialite specialite);
    void deleteById(int id);
}
