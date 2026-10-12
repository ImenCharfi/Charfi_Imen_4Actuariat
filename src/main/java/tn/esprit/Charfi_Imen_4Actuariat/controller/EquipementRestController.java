package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Equipement;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IEquipementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    IEquipementService equipementService;

    // http://localhost:8081/equipement/retrieve-all-equipements
    @GetMapping("/retrieve-all-equipements")
    public Set<Equipement> getEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    // http://localhost:8081/equipement/retrieve-equipement/1
    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        return equipementService.retrieveEquipement(equipementId);
    }

    // http://localhost:8081/equipement/add-equipement
    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return equipementService.addEquipement(e);
    }

    // http://localhost:8081/equipement/modify-equipement
    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement e) {
        return equipementService.updateEquipement(e);
    }

    // http://localhost:8081/equipement/remove-equipement/1
    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementService.deleteEquipement(equipementId);
    }
}