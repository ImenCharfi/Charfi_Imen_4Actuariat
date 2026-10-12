package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Vehicule;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IVehiculeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {

    IVehiculeService vehiculeService;

    // http://localhost:8081/vehicule/retrieve-all-vehicules
    @GetMapping("/retrieve-all-vehicules")
    public Set<Vehicule> getVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    // http://localhost:8081/vehicule/retrieve-vehicule/1
    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        return vehiculeService.retrieveVehicule(vehiculeId);
    }

    // http://localhost:8081/vehicule/add-vehicule
    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeService.addVehicule(v);
    }

    // http://localhost:8081/vehicule/modify-vehicule
    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule v) {
        return vehiculeService.updateVehicule(v);
    }

    // http://localhost:8081/vehicule/remove-vehicule/1
    @DeleteMapping("/remove-vehicule/{vehicule-id}")
    public void removeVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehiculeService.deleteVehicule(vehiculeId);
    }
}