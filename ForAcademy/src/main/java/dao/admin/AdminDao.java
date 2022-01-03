package dao.admin;

import models.Admin;
import models.Adress;

import java.util.List;

public interface AdminDao {
    List<Admin> findAll();
    Admin findById(int id);
    void save(Admin admin);
    void update (Admin admin);

}
