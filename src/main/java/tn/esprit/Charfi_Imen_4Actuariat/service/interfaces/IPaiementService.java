package tn.esprit.Charfi_Imen_4Actuariat.service.interfaces;

import tn.esprit.Charfi_Imen_4Actuariat.entities.Paiement;
import java.util.Set;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    Paiement retrievePaiement(Long id);
    Set<Paiement> retrieveAllPaiements();
}