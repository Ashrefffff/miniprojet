package com.example.API.model;

import com.example.API.model.Vol;

public class PersonnelCabine extends Employe {
    private String qualification;
    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }
    public void affecterVol(Vol vol) {
        System.out.println("Personnel cabine affecté au vol: " + vol.getNumeroVol());
    }
    public void obtenirVol(Vol vol) {
        System.out.println("Détails du vol: " + vol.getNumeroVol());
    }
    @Override
    public String obtenirRole() {
        return "Rôle: Personnel Cabine";
    }
}

