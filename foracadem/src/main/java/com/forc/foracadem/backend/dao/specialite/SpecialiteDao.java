package com.forc.foracadem.backend.dao.specialite;

import com.forc.foracadem.backend.models.Specialite;

import java.util.List;

public interface SpecialiteDao {
    List<Specialite> findAll();
    Specialite findById(int id);
    void save(Specialite specialite);
    void update (Specialite specialite);
    void deleteById(int id);
}
