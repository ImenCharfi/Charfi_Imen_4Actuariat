package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Employe;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IEmployeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {

    IEmployeService employeService;

    // http://localhost:8081/employe/retrieve-all-employes
    @GetMapping("/retrieve-all-employes")
    public Set<Employe> getEmployes() {
        return employeService.retrieveAllEmployes();
    }

    // http://localhost:8081/employe/retrieve-employe/1
    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        return employeService.retrieveEmploye(employeId);
    }

    // http://localhost:8081/employe/add-employe
    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe e) {
        return employeService.addEmploye(e);
    }

    // http://localhost:8081/employe/modify-employe
    @PutMapping("/modify-employe")
    public Employe modifyEmploye(@RequestBody Employe e) {
        return employeService.updateEmploye(e);
    }

    // http://localhost:8081/employe/remove-employe/1
    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.deleteEmploye(employeId);
    }
}