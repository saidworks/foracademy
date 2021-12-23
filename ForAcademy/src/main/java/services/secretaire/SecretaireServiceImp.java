package services.secretaire;

import dao.secretaireDao.IsecretaireDao;
import dao.secretaireDao.SecretaireDaoImp;
import models.Secretaire;

import java.util.Scanner;

public class SecretaireServiceImp implements SecretaireServiceInt {
    Scanner scanner = new Scanner(System.in);
    @Override
    public boolean changeMyPassword() {
        IsecretaireDao secretaireDaoImp = new SecretaireDaoImp();
        int id ;
        String oldPass ="";
        String newPass ="";
        String column = "password";
        System.out.println("Enter utilisteur id : ");
        id = scanner.nextInt();
        System.out.println("Enter utilisteur old pass : ");
        oldPass = scanner.next();

        Secretaire secretaire = secretaireDaoImp.selectById(id);
        System.out.println(secretaire);
        String pass = secretaire.getPassword();
        if (pass.equals(oldPass)){
            System.out.println("Enter utilisteur new password : ");
            newPass = scanner.next();
            secretaireDaoImp.updateDetailsSecretaire(secretaire, column, newPass);
            return true;
        } else {
            System.out.println("password not match");
        }

        return false;
    }
}
