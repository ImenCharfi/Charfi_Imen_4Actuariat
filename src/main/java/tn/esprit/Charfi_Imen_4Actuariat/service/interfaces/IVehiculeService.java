package tn.esprit.Charfi_Imen_4Actuariat.service.interfaces;

import tn.esprit.Charfi_Imen_4Actuariat.entities.Vehicule;
import java.util.Set;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    Vehicule retrieveVehicule(Long id);
    Set<Vehicule> retrieveAllVehicules();
}