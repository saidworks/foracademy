
import services.secretaire.SecretaireServiceImp;
import services.secretaire.SecretaireServiceInt;
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


        SecretaireServiceInt secretaireService = new SecretaireServiceImp();
        //secretaireService.changeMyPassword();
        secretaireService.secretairePointage();




    }
}