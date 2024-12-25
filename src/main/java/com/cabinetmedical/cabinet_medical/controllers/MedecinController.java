package com.cabinetmedical.cabinet_medical.controllers;

import com.cabinetmedical.cabinet_medical.entities.Medecin;
import com.cabinetmedical.cabinet_medical.services.MedecinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/medecins")
public class MedecinController {
    private final MedecinService medecinService;

    public MedecinController(MedecinService medecinService) {
        this.medecinService = medecinService;
    }

    @GetMapping
    public String getAllMedecins(Model model) {
        List<Medecin> medecins = medecinService.getAllMedecins();
        model.addAttribute("medecins", medecins);
        return "medecins/list";
    }

    @PostMapping
    public String createMedecin(@ModelAttribute Medecin medecin) {
        medecinService.createMedecin(medecin);
        return "redirect:/medecins";
    }

    @PutMapping("/{id}")
    public String updateMedecin(@PathVariable Long id, @ModelAttribute Medecin medecinDetails) {
        medecinService.updateMedecin(id, medecinDetails);
        return "redirect:/medecins";
    }

    @DeleteMapping("/{id}")
    public String deleteMedecin(@PathVariable Long id) {
        medecinService.deleteMedecin(id);
        return "redirect:/medecins";
    }
}
