package com.cabinetmedical.cabinet_medical.repositories;



import com.cabinetmedical.cabinet_medical.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
