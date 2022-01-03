import dao.admin.AdminDao;
import dao.admin.AdminDaoImp;
import controllers.SecretaireController;
import dao.adress.AdressDao;
import dao.adress.AdressDaoImp;
import dao.pointageDAO.IpointageDao;
import dao.pointageDAO.PointageDaoImp;
import dao.specialite.SpecialiteDao;
import dao.specialite.SpecialiteDaoImp;
import models.Admin;
import models.Adress;
import models.Pointage;
import models.Specialite;

//import services.secretaire.SecretaireServiceImp;
import services.secretaire.SecretaireServiceInt;
import utils.DBUtil;

import java.sql.Connection;
import java.util.ArrayList;
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
       // AdressDao adressDao = new AdressDaoImp();
         //to add a new adress.
         /*Adress adress = new Adress(0, "dar ssalam", "rabat", 350);
        adressDao.save(adress);*/

        // to update an adress
        /*Adress adress = new Adress(1, "dior ssalam", "rabat", 350);
        adressDao.update(adress);*/

        // to print all adresses
        /*adressDao.findAll().forEach(System.out::println);*/

        //to find an object by id
         /*Adress adress =  adressDao.findById(2);
         System.out.println(adress);*/

        //to delete one object
        /*adressDao.deleteById(2);*/
      //  adressDao.deleteById(2);

        //SecretaireServiceInt secretaireService = new SecretaireServiceImp();
        //secretaireService.changeMyPassword();
        //secretaireService.secretairePointage();

        AdminDao adminDao = new AdminDaoImp();
        /*Admin admin = new Admin(0,"abdo","youssef", "masculin", "056789788", "aziz@gmail.com","hellobardichjkhk", true, 3, 3);
       adminDao.save(admin);*/
        List<Admin> findAdmins =  new ArrayList<>();
        //System.out.println("hi");
        // to print all admins
       /* findAdmins=  adminDao.findAll();
        for (Admin x: findAdmins) {
            System.out.println(x);
        }*/
        // admin find by id
        /*Admin adminById = adminDao.findById(4);
        System.out.println(adminById);*/

        Admin admin = new Admin(4,"aminati","youssef", "masculin", "0659658022", "amina@gmail.com","hellobardichjkhk", true, 3, 3);
       adminDao.update(admin);

    }
}