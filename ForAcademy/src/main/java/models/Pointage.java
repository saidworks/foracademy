package models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class Pointage {
    private int id_pointage;
    private LocalDateTime h_arrivee_pointage;
    private LocalDateTime h_departe_pointage;
    private Date date_pointage;
    private int id_user;

    public Pointage(LocalDateTime h_arrivee_pointage, LocalDateTime h_departe_pointage, Date date_pointage, int id_user) {
        this.h_arrivee_pointage = h_arrivee_pointage;
        this.h_departe_pointage = h_departe_pointage;
        this.date_pointage = date_pointage;
        this.id_user = id_user;
    }

    public Pointage() {

        this.h_arrivee_pointage = LocalDateTime.now();
        this.h_departe_pointage = h_departe_pointage;
        this.date_pointage = new Date();
        this.id_user = id_user;
    }

    public int getId_pointage() {
        return id_pointage;
    }

    public void setId_pointage(int id_pointage) {
        this.id_pointage = id_pointage;
    }

    public LocalDateTime getH_arrivee_pointage() {
        return h_arrivee_pointage;
    }

    public void setH_arrivee_pointage(LocalDateTime h_arrivee_pointage) {
        this.h_arrivee_pointage = h_arrivee_pointage;
    }

    public LocalDateTime getH_departe_pointage() {
        return h_departe_pointage;
    }

    public void setH_departe_pointage(LocalDateTime h_departe_pointage) {
        this.h_departe_pointage = h_departe_pointage;
    }

    public Date getDate_pointage() {
        return date_pointage;
    }

    public void setDate_pointage(Date date_pointage) {
        this.date_pointage = date_pointage;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Pointage{" +
                "id_pointage=" + id_pointage +
                ", h_arrivee_pointage=" + h_arrivee_pointage +
                ", h_departe_pointage=" + h_departe_pointage +
                ", date_pointage=" + date_pointage +
                '}';
    }
}
