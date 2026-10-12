package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Maintenance;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IMaintenanceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {

    IMaintenanceService maintenanceService;

    // http://localhost:8081/maintenance/retrieve-all-maintenances
    @GetMapping("/retrieve-all-maintenances")
    public Set<Maintenance> getMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    // http://localhost:8081/maintenance/retrieve-maintenance/1
    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        return maintenanceService.retrieveMaintenance(maintenanceId);
    }

    // http://localhost:8081/maintenance/add-maintenance
    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.addMaintenance(m);
    }

    // http://localhost:8081/maintenance/modify-maintenance
    @PutMapping("/modify-maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.updateMaintenance(m);
    }

    // http://localhost:8081/maintenance/remove-maintenance/1
    @DeleteMapping("/remove-maintenance/{maintenance-id}")
    public void removeMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceService.deleteMaintenance(maintenanceId);
    }
}