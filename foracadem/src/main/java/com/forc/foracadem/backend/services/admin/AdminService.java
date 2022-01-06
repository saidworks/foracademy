package com.forc.foracadem.backend.services.admin;


import com.forc.foracadem.backend.models.Admin;
import com.forc.foracadem.backend.models.Utilisateur;

import java.util.List;

public interface AdminService {
    public Utilisateur changeAllpassword(Utilisateur utilisateur);

    public boolean changeStatut(Utilisateur utilisateur);

    public boolean getAllpointing();
    public boolean createCheffabrique();
    public List<Admin> getAll();

    public int login(String email, String password);
}
