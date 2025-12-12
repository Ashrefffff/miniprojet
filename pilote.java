package com.example.API.model;


import com.example.API.model.Vol;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;
    public Pilote(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }
    public void affecterVol(Vol vol) {
        System.out.println("Pilote affecté au vol: " + vol.getNumeroVol());
    }
    public void obtenirVol(Vol vol) {
        System.out.println("Détails du vol: " + vol.getNumeroVol());
    }
    @Override
    public String obtenirRole() {
        return "Rôle: Pilote";
    }
}

