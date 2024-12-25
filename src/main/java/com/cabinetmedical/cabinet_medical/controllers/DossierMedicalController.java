package com.cabinetmedical.cabinet_medical.controllers;

import com.cabinetmedical.cabinet_medical.entities.DossierMedical;
import com.cabinetmedical.cabinet_medical.services.DossierMedicalService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/dossiers")
public class DossierMedicalController {
    private final DossierMedicalService dossierMedicalService;

    public DossierMedicalController(DossierMedicalService dossierMedicalService) {
        this.dossierMedicalService = dossierMedicalService;
    }

    @GetMapping("/{id}")
    public Optional<DossierMedical> getDossierMedicalById(@PathVariable Long id) {
        return dossierMedicalService.getDossierMedicalById(id);
    }

    @PostMapping
    public DossierMedical createDossierMedical(@RequestBody DossierMedical dossierMedical) {
        return dossierMedicalService.createDossierMedical(dossierMedical);
    }

    @DeleteMapping("/{id}")
    public void deleteDossierMedical(@PathVariable Long id) {
        dossierMedicalService.deleteDossierMedical(id);
    }
}
