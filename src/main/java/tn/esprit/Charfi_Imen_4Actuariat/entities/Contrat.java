package tn.esprit.Charfi_Imen_4Actuariat.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;//type wrapper (ya long ya integer)

    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    @OneToOne
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JsonIgnore
    private Set<Paiement> paiements ;
}