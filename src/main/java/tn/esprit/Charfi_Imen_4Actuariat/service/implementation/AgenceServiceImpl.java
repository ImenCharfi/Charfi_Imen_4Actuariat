package tn.esprit.Charfi_Imen_4Actuariat.service.implementation;

import org.springframework.stereotype.Service;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Agence;
import tn.esprit.Charfi_Imen_4Actuariat.repository.AgenceRepository;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IAgenceService;
import java.util.HashSet;
import java.util.Set;

@Service
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;

    public AgenceServiceImpl(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence retrieveAgence(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Agence> retrieveAllAgences() {
        return new HashSet<>(agenceRepository.findAll());
    }
}