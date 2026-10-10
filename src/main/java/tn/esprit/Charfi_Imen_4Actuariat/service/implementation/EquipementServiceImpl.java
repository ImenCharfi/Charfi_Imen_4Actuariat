package tn.esprit.Charfi_Imen_4Actuariat.service.implementation;

import org.springframework.stereotype.Service;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Equipement;
import tn.esprit.Charfi_Imen_4Actuariat.repository.EquipementRepository;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IEquipementService;
import java.util.HashSet;
import java.util.Set;

@Service
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    public EquipementServiceImpl(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public Equipement retrieveEquipement(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Equipement> retrieveAllEquipements() {
        return new HashSet<>(equipementRepository.findAll());
    }
}