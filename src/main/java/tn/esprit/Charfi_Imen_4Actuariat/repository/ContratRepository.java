package tn.esprit.Charfi_Imen_4Actuariat.repository;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Contrat;

public interface ContratRepository  extends JpaRepository<Contrat, Long> {
}
