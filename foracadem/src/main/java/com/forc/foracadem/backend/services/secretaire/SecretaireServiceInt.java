package com.forc.foracadem.backend.services.secretaire;

import com.forc.foracadem.backend.models.Pointage;

public interface SecretaireServiceInt {
    boolean changeMyPassword();
    boolean secretairePointage(Pointage pointage);
    boolean secretaireDepartPointage();


}
