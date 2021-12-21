import dao.specialite.SpecialiteDao;
import dao.specialite.SpecialiteDaoImp;
import utils.DBUtil;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();
        if (conn == null) {
            System.out.println("connection failed");
        } else {
            System.out.println("connection succes");
        }


        SpecialiteDao specialiteDao = new SpecialiteDaoImp();
        // to add a new secretaire.
        //Specialite specialite = new Specialite(0, "formateur");
        //specialiteDao.save(specialite);

        // to update an object
        //Specialite specialite = new Specialite(2, "java");
        //specialiteDao.update(specialite);

        // to print all object
        /*specialiteDao.findAll().forEach(System.out::println);*/

        // to find an object by id
        //Specialite spec =  specialiteDao.findById(3);
        //System.out.println(spec);

        // to delete one object
        // specialiteDao.deleteById(4);
    }
}