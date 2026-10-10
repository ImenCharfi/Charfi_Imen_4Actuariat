package tn.esprit.Charfi_Imen_4Actuariat.service.interfaces;

import tn.esprit.Charfi_Imen_4Actuariat.entities.Agence;
import java.util.Set;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
    Agence retrieveAgence(Long id);
    Set<Agence> retrieveAllAgences();
}