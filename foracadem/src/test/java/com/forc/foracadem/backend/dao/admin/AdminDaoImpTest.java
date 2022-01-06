package com.forc.foracadem.backend.dao.admin;

import com.forc.foracadem.backend.models.Admin;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AdminDaoImpTest {
    AdminDao adminDao;
    @BeforeAll
    public static void SetUpAll(){

        System.out.println("this gonna print it first");
    }

    @BeforeEach
    public void SetUp(){
        adminDao = new AdminDaoImp();
    }

    @Test
    void findAll() {
        //List<Admin> admins = new ArrayList<>();
        Assertions.assertFalse(adminDao.findAll().isEmpty());
        Assertions.assertEquals(14,adminDao.findAll().size());
    }

    @Test
    void findById() {
        Admin admin = new Admin();
        admin = adminDao.findById(4);
        Assertions.assertEquals("aminati", admin.getNom_user());
    }
   @Disabled
    //@Test
    void save() {
        Admin admin = new Admin(0,"salah","salhi","female","09898", "salah@gmail.com", "salah",true,4,5);
        adminDao.save(admin);
        Assertions.assertEquals("salah", admin.getNom_user());

    }

    @Test
    void update() {
        Admin admin = new Admin(30,"mountaiss","salhi","female","09898", "salah@gmail.com", "salah",true,4,5);
        adminDao.update(admin);
        Assertions.assertEquals("mountaiss", admin.getNom_user());
    }
}