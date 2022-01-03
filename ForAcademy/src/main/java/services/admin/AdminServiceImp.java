package services.admin;

import dao.admin.AdminDao;
import dao.admin.AdminDaoImp;
import dao.chefFabriqueDao.ChefFabriqueDaoImp;
import dao.chefFabriqueDao.IChefFabriqueDao;
import models.Admin;
import models.ChefFabrique;
import models.Utilisateur;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
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
}
