package com.cabinetmedical.cabinet_medical.services;

import com.cabinetmedical.cabinet_medical.entities.DossierMedical;
import com.cabinetmedical.cabinet_medical.repositories.DossierMedicalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DossierMedicalService {
    private final DossierMedicalRepository dossierMedicalRepository;

    public DossierMedicalService(DossierMedicalRepository dossierMedicalRepository) {
        this.dossierMedicalRepository = dossierMedicalRepository;
    }

    public Optional<DossierMedical> getDossierMedicalById(Long id) {
        return dossierMedicalRepository.findById(id);
    }

    public DossierMedical createDossierMedical(DossierMedical dossierMedical) {
        return dossierMedicalRepository.save(dossierMedical);
    }

    public void deleteDossierMedical(Long id) {
        dossierMedicalRepository.deleteById(id);
    }
}
