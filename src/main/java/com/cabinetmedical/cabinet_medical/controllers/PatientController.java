package com.cabinetmedical.cabinet_medical.controllers;

import com.cabinetmedical.cabinet_medical.entities.Patient;
import com.cabinetmedical.cabinet_medical.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService PatientService;

    // Afficher la liste des patients
    @GetMapping
    public String showPatientList(Model model) {
        model.addAttribute("patients", PatientService.getAllPatients());
        return "patients/list"; // Chemin du fichier HTML : templates/patients/list.html
    }

    // Afficher le formulaire de création d'un patient
    @GetMapping("/create")
    public String showCreatePatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patients/create"; // Chemin du fichier HTML : templates/patients/create.html
    }

    // Traiter le formulaire de création d'un patient
    @PostMapping("/create")
    public String createPatient(@ModelAttribute Patient patient) {
        PatientService.createPatient(patient);
        return "redirect:/patients"; // Redirige vers la liste des patients
    }

    // Afficher le formulaire de mise à jour d'un patient
    @GetMapping("/edit/{id}")
    public String showEditPatientForm(@PathVariable Long id, Model model) {
        Patient patient = PatientService.getPatientById(id).orElseThrow(() -> new IllegalArgumentException("Invalid patient Id:" + id)); // Assurez-vous que le service a cette méthode
        model.addAttribute("patient", patient);
        return "patients/edit"; // Chemin du fichier HTML : templates/patients/edit.html
    }

    // Traiter le formulaire de mise à jour d'un patient
    @PostMapping("/edit/{id}")
    public String updatePatient(@PathVariable Long id, @ModelAttribute Patient patient) {
        PatientService.updatePatient(id, patient);
        return "redirect:/patients"; // Redirige vers la liste des patients
    }

    // Supprimer un patient
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        PatientService.deletePatient(id);
        return "redirect:/patients"; // Redirige vers la liste des patients
    }
}
