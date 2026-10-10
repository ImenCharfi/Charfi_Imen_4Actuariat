package tn.esprit.Charfi_Imen_4Actuariat.service.implementation;

import org.springframework.stereotype.Service;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Maintenance;
import tn.esprit.Charfi_Imen_4Actuariat.repository.MaintenanceRepository;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IMaintenanceService;
import java.util.HashSet;
import java.util.Set;

@Service
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceServiceImpl(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance retrieveMaintenance(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Maintenance> retrieveAllMaintenances() {
        return new HashSet<>(maintenanceRepository.findAll());
    }
}