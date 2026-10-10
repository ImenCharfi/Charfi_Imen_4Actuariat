package tn.esprit.Charfi_Imen_4Actuariat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}