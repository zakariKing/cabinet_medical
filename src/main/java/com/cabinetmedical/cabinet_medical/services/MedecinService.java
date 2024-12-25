package com.cabinetmedical.cabinet_medical.services;

import com.cabinetmedical.cabinet_medical.entities.Medecin;
import com.cabinetmedical.cabinet_medical.repositories.MedecinRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedecinService {
    private final MedecinRepository medecinRepository;

    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    public Optional<Medecin> getMedecinById(Long id) {
        return medecinRepository.findById(id);
    }

    public Medecin createMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    public Medecin updateMedecin(Long id, Medecin medecinDetails) {
        return medecinRepository.findById(id).map(medecin -> {
            medecin.setNom(medecinDetails.getNom());
            medecin.setSpecialite(medecinDetails.getSpecialite());
            return medecinRepository.save(medecin);
        }).orElseThrow(() -> new RuntimeException("Medecin not found"));
    }

    public void deleteMedecin(Long id) {
        medecinRepository.deleteById(id);
    }
}
