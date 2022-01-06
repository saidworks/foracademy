package com.forc.foracadem.backend.dao.admin;



import com.forc.foracadem.backend.models.Admin;

import java.util.List;

public interface AdminDao {
    List<Admin> findAll();
    Admin findById(int id);
    void save(Admin admin);
    void update (Admin admin);
    Admin findByEmail(String email);

}
