package tn.esprit.Charfi_Imen_4Actuariat.service.interfaces;

import tn.esprit.Charfi_Imen_4Actuariat.entities.Employe;
import java.util.Set;

public interface IEmployeService {
    Employe addEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Long id);
    Employe retrieveEmploye(Long id);
    Set<Employe> retrieveAllEmployes();
}