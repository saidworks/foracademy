package controllers;

import models.Pointage;
import models.Secretaire;
import services.secretaire.SecretaireServiceImp;
import services.secretaire.SecretaireServiceInt;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SecretaireController {
    Scanner scanner = new Scanner(System.in);
    int pointage_times = 0;
    // make list for secretaire daily pointage


    // method handle secretaire pointage
    public Pointage secretairePointage(){
        List<LocalDateTime> dailyPointage = new ArrayList<>();
        SecretaireServiceInt secretaireService = new SecretaireServiceImp();
        Pointage pointage = new Pointage();
        pointage_times++;
        if (pointage_times == 2){
            pointage.setH_departe_pointage();
            secretaireService.secretairePointage(pointage);

        }

        return pointage;
    }



}
