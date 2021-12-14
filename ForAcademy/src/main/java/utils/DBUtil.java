package utils;

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
                String url = "jdbc:mysql://localhost/foracademy";
                String username = "admin";
                String password = "Admin@2022";
                // get and return connection
                connection = DriverManager.getConnection(url,username,password);
                return connection;
            }
            catch(SQLException e){
                throw new DBException(e);
            }
        }


    }

    public static void main(String[] args) throws DBException {
        Connection cnx = DBUtil.getConnection();
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