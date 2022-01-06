package com.forc.foracadem.backend.services.admin;

import com.forc.foracadem.backend.dao.admin.AdminDao;
import com.forc.foracadem.backend.dao.admin.AdminDaoImp;
import com.forc.foracadem.backend.dao.chefFabriqueDao.ChefFabriqueDaoImp;
import com.forc.foracadem.backend.dao.chefFabriqueDao.IChefFabriqueDao;
import com.forc.foracadem.backend.models.Admin;
import com.forc.foracadem.backend.models.ChefFabrique;
import com.forc.foracadem.backend.models.Utilisateur;
import com.forc.foracadem.backend.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AdminServiceImp implements AdminService{

    @Override
    public Utilisateur changeAllpassword(Utilisateur utilisateur) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return null;
        }
        String query = "UPDATE utilisateur SET password =? WHERE id_user= ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {



            preparedStatement.setString(1,  utilisateur.getPassword());
            preparedStatement.setInt(2,  utilisateur.getId_user());

            preparedStatement.executeUpdate();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

      return new Utilisateur();
    }

    @Override
    public boolean changeStatut(Utilisateur utilisateur) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            return false;
        }
        String query = "UPDATE utilisateur SET status_user =? WHERE id_user= ?;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);) {



            preparedStatement.setBoolean(1,  utilisateur.isStatus_user());
            preparedStatement.setInt(2,  utilisateur.getId_user());

            preparedStatement.executeUpdate();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return true;
    }




    @Override
    public boolean getAllpointing() {
        return true;
    }

    @Override
    public boolean createCheffabrique() {
        IChefFabriqueDao chefFabriqueDao = new ChefFabriqueDaoImp();
        ChefFabrique chefFabrique = new ChefFabrique(0,"boudali","hajar","féminin","98239087190270", "hajar@gmail.com","hajarhajar",true,3,5,new Date());
        chefFabriqueDao.saveChefFabrique(chefFabrique);

        return true;
    }

    @Override
    public List<Admin> getAll() {
        AdminDao adminDao = new AdminDaoImp();
       List<Admin> admins= adminDao.findAll();
       return admins;
    }

    @Override
    public int login(String email, String password) {
        AdminDao adminDao = new AdminDaoImp();
        Admin admin = adminDao.findByEmail(email);
        if(admin == null || admin.getEmail() == null){
            return 0; // no admin found!
        }
        if (admin.getPassword().equals(password)){
            return 1; // login approved
        }
        return 2; // Wrong password
    }
}
