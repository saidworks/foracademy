package services.admin;


import models.Admin;
import models.Utilisateur;

public interface AdminService {
    public Utilisateur changeAllpassword(Utilisateur utilisateur);

    public boolean changeStatut(Utilisateur utilisateur);

    public boolean getAllpointing();
    public boolean createCheffabrique();
}
