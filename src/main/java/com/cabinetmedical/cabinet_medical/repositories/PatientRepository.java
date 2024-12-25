package com.cabinetmedical.cabinet_medical.repositories;


import com.cabinetmedical.cabinet_medical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
