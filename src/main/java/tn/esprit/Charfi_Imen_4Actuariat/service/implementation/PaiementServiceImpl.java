package tn.esprit.Charfi_Imen_4Actuariat.service.implementation;

import org.springframework.stereotype.Service;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Paiement;
import tn.esprit.Charfi_Imen_4Actuariat.repository.PaiementRepository;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IPaiementService;
import java.util.HashSet;
import java.util.Set;

@Service
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public Paiement retrievePaiement(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Paiement> retrieveAllPaiements() {
        return new HashSet<>(paiementRepository.findAll());
    }
}