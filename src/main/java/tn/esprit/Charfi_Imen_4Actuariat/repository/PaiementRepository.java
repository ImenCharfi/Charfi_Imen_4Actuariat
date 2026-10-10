package tn.esprit.Charfi_Imen_4Actuariat.repository;

import org.springframework.data.jpa.repository.JpaRepository;;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}