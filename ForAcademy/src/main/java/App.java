import dao.admin.AdminDao;
import dao.admin.AdminDaoImp;
import dao.adress.AdressDao;
import dao.adress.AdressDaoImp;
import dao.chefFabriqueDao.ChefFabriqueDaoImp;
import dao.chefFabriqueDao.IChefFabriqueDao;
import dao.pointageDAO.IpointageDao;
import dao.pointageDAO.PointageDaoImp;
import dao.secretaireDao.IsecretaireDao;
import dao.secretaireDao.ScretaireDaoImp;
import models.*;

//import services.secretaire.SecretaireServiceImp;
import services.admin.AdminService;
import services.admin.AdminServiceImp;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            System.out.println("connection failed");
        } else {
            System.out.println("connection succes");
        }


        // SpecialiteDao specialiteDao = new SpecialiteDaoImp();
        /* to add a new secretaire.
         Specialite specialite = new Specialite(0, "formateur");
        specialiteDao.save(specialite);*/

        /* to update an object
        Specialite specialite = new Specialite(2, "java");
        specialiteDao.update(specialite);*/

        // to print all object
        /*specialiteDao.findAll().forEach(System.out::println);*/

        /*to find an object by id
         Specialite spec =  specialiteDao.findById(3);
         System.out.println(spec);*/

        /*to delete one object
        specialiteDao.deleteById(4);*/

        //#### testinig for adress###
         //AdressDao adressDao = new AdressDaoImp();
         //to add a new adress.
         //Adress adress = new Adress(0, "dar ssalam", "sale", 350);
        //adressDao.save(adress);

        // to update an adress
        /*Adress adress = new Adress(1, "dior ssalam", "rabat", 350);
        adressDao.update(adress);*/

        // to print all adresses
        /*adressDao.findAll().forEach(System.out::println);*/

        //to find an object by id
        /*
         Adress adress =  adressDao.findById(3);
         System.out.println(adress);

        //to delete one object
        /*adressDao.deleteById(2);*/
      //  adressDao.deleteById(2);

        //SecretaireServiceInt secretaireService = new SecretaireServiceImp();
        //secretaireService.changeMyPassword();
        //secretaireService.secretairePointage();
/*
        AdminDao adminDao = new AdminDaoImp();
        Admin admin = new Admin(0,"hamoudi","amina", "masculin", "056789788", "aziz@gmail.com","hellobardichjkhk", true, 3, 3);
       adminDao.save(admin);
        List<Admin> findAdmins =  new ArrayList<>();
        */
        //System.out.println("hi");
        //to print all admins
       /*findAdmins=  adminDao.findAll();
        for (Admin x: findAdmins) {
            System.out.println(x);
        }*/
        // admin find by id
        /*Admin adminById = adminDao.findById(4);
        System.out.println(adminById);*/

        //Admin admin = new Admin(4,"aminati","youssef", "masculin", "0659658022", "amina@gmail.com","hellobardichjkhk", true, 3, 3);
       //adminDao.update(admin);

       // IsecretaireDao secretaireDao = new ScretaireDaoImp();
        //Secretaire secretaire = new Secretaire(0,"hamoudi","amina", "masculin", "056789788", "aziz@gmail.com","hellobardichjkhk", true, 3, 3);
        //secretaireDao.saveSecretaire(secretaire);

        //Secretaire secretaire =  secretaireDao.selectById(18);
        //System.out.println(secretaire);

        /*IpointageDao ipointageDao = new PointageDaoImp();
        Pointage pointage = new Pointage();

        try {
            ipointageDao.savePointage(secretaire, pointage);
        } catch (SQLException e) {
            e.printStackTrace();
        }

         */
       /* IChefFabriqueDao chefFabriqueDao = new ChefFabriqueDaoImp();
        ChefFabrique chefFabrique = new ChefFabrique(0,"elkhatbi","aimad","masculin","98239087190270", "elkhatabi@gmail.com","aimadaimad",true,3,5,new Date());
        chefFabriqueDao.saveChefFabrique(chefFabrique);

        */
        AdminService adminService = new AdminServiceImp();
        // adminService.createCheffabrique();
       /*Utilisateur utilisateur =new Utilisateur(2);
       utilisateur.setStatus_user(false);
       adminService.changeStatut(utilisateur);
       utilisateur.setPassword("iamchanged");
       adminService.changeAllpassword(utilisateur);

        */
    }
}