package com.cabinetmedical.cabinet_medical.entities;

import jakarta.persistence.*;

@Entity
public class DossierMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String historique;
    private String traitementEnCours;

    @OneToOne
    @JoinColumn(name = "Patient_id")
    private Patient patient;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getHistorique() { return historique; }
    public void setHistorique(String historique) { this.historique = historique; }
    public String getTraitementEnCours() { return traitementEnCours; }
    public void setTraitementEnCours(String traitementEnCours) { this.traitementEnCours = traitementEnCours; }
    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }
}
