package utils;

import dao.roleDAO.RoleDaoImp;
import dao.secretaireDao.SecretaireDaoImp;
import models.Role;
import models.Secretaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
    private static Connection connection;
    private DBUtil() {}
    public static synchronized Connection getConnection() throws DBException{
        if(connection != null) {
            return connection;
        }
        else {
            try{
                //user 'admin'@'localhost' password 'Admin@2022'
                //db foracedemy
                // set the DB url , user name, and password
                String url = "jdbc:mysql://localhost:3306/foracademy";
                String username = "root";
                String password = "";
                // get and return connection
                connection = DriverManager.getConnection(url,username,password);
                return connection;
            }
            catch(SQLException e){
                throw new DBException(e);
                //System.out.println("not success");
            }
        }

    }

    public static void main(String[] args) throws DBException {
        /*Role role = new Role("user");
        RoleDaoImp rl = new RoleDaoImp();
        rl.saveRole(role);*/

        Secretaire secretaire =new Secretaire("hajar","hajar", true,"2342323","hajar@test","12345", true);
        SecretaireDaoImp secretaireDaoImp = new SecretaireDaoImp();
        secretaireDaoImp.saveSecretaire(secretaire);


    }
    public static synchronized void closeConnection() throws DBException{
        if(connection != null) {
            try {
                connection.close();
            }
            catch(SQLException e){
                throw new DBException(e);
            }
            finally {
                connection = null;
            }
        }
    }
}