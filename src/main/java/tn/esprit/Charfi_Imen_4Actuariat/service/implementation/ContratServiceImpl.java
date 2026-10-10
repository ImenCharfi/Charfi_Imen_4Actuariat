package tn.esprit.Charfi_Imen_4Actuariat.service.implementation;

import org.springframework.stereotype.Service;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Contrat;
import tn.esprit.Charfi_Imen_4Actuariat.repository.ContratRepository;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IContratService;
import java.util.HashSet;
import java.util.Set;

@Service
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat retrieveContrat(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Contrat> retrieveAllContrats() {
        return new HashSet<>(contratRepository.findAll());
    }
}