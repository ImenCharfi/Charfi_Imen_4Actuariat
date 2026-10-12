package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Contrat;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IContratService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    IContratService contratService;

    // http://localhost:8081/contrat/retrieve-all-contrats
    @GetMapping("/retrieve-all-contrats")
    public Set<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }

    // http://localhost:8081/contrat/retrieve-contrat/1
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    // http://localhost:8081/contrat/add-contrat
    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        return contratService.addContrat(c);
    }

    // http://localhost:8081/contrat/modify-contrat
    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat c) {
        return contratService.updateContrat(c);
    }

    // http://localhost:8081/contrat/remove-contrat/1
    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Long contratId) {
        contratService.deleteContrat(contratId);
    }
}