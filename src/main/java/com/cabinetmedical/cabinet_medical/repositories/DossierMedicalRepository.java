package com.cabinetmedical.cabinet_medical.repositories;

import com.cabinetmedical.cabinet_medical.entities.DossierMedical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierMedicalRepository extends JpaRepository<DossierMedical, Long> {
}
